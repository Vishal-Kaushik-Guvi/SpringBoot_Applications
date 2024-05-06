package com.Testing.SpringBatch.Configuration;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.Testing.SpringBatch.Entity.Finance;

public class FiananceProccessor implements ItemProcessor<Finance,Finance> {

    @Override
    @Nullable
    public Finance process(@NonNull Finance finance) throws Exception {
        return finance;
    }

}
