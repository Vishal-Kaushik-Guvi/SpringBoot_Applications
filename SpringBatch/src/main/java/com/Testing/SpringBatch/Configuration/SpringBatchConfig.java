package com.Testing.SpringBatch.Configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;

import com.Testing.SpringBatch.Entity.Finance;
import com.Testing.SpringBatch.Repository.FinanceRepository;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SpringBatchConfig {

@Autowired
private FinanceRepository financeRepo; 

public LineMapper<Finance> lineMapper(){
DefaultLineMapper<Finance> defaulLineMapper= new DefaultLineMapper<>();

// to delete unncerry content from the file

DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
tokenizer.setDelimiter(",");
tokenizer.setStrict(false);
tokenizer.setNames("id","segement","country","product","units sold","date");

BeanWrapperFieldSetMapper<Finance> fieldMapper = new BeanWrapperFieldSetMapper<>();

fieldMapper.setTargetType(Finance.class);

defaulLineMapper.setLineTokenizer(tokenizer);
defaulLineMapper.setFieldSetMapper(fieldMapper);

return defaulLineMapper;
}
//  Retrieve the file data
public FlatFileItemReader<Finance> reader(){
FlatFileItemReader<Finance> itemReader = new FlatFileItemReader<>();
itemReader.setResource(new FileSystemResource("src/main/resources/FinanceReport.csv"));
itemReader.setLinesToSkip(1); // to skip the 1st row of lines
itemReader.setLineMapper(lineMapper());
return itemReader;
}

@Bean
public FiananceProccessor financeProcess(){
    return new FiananceProccessor();
}

@Bean
public RepositoryItemWriter<Finance> writer(){
RepositoryItemWriter<Finance> write = new RepositoryItemWriter<>();
write.setRepository(financeRepo);
write.setMethodName("save"); // method of repo to call
return write;
}

@Bean
public Step step(JobRepository jobRepo, PlatformTransactionManager transcManger){
    return new StepBuilder("firstStep", jobRepo)
    .<Finance,Finance>chunk(10,transcManger)
    .reader(reader()).processor(financeProcess())
    .writer(writer()).taskExecutor(taskExecutor()).build();
}

@Bean
public TaskExecutor taskExecutor() {
   SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor();
   executor.setConcurrencyLimit(10);
   return executor;
}

@Bean
public Job runJob(JobRepository jobRepo, PlatformTransactionManager transcManger){
    return new JobBuilder("do-job", jobRepo)
    .flow(step(jobRepo, transcManger)).end().build();
}
}
