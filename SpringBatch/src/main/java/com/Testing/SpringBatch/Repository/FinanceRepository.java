package com.Testing.SpringBatch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Testing.SpringBatch.Entity.Finance;

public interface FinanceRepository extends JpaRepository<Finance, Integer> {

}
