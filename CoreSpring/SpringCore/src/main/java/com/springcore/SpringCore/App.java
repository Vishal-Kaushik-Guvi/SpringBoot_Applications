package com.springcore.SpringCore;

import SpringCore.CollectionType.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/SpringCore/Test.xml");
        Student result1 =(Student) ac.getBean("std1");
        Student result2 =(Student) ac.getBean("std2");
        System.out.println(result1);
        System.out.println(result2);
        
        ApplicationContext ac2 = new ClassPathXmlApplicationContext("SpringCore/CollectionType/TestEmp.xml");
        Employee empresult = (Employee) ac2.getBean("Emp1");
        System.out.println(empresult.getEmp_id());
        System.out.println(empresult.getEmp_FamilyMembers());
        System.out.println(empresult.getEmp_Name());
        System.out.println(empresult.getEmp_Work());
  
    }
}