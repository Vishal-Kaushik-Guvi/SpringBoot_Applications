package com.Guvi.Spring.SpringBoot.Services;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
    private String Pname;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Pid;
    
    private int Pvalue;

    public Products() {
        // Default constructor is required by JPA
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public int getPvalue() {
        return Pvalue;
    }

    public void setPvalue(int pvalue) {
        Pvalue = pvalue;
    }
}