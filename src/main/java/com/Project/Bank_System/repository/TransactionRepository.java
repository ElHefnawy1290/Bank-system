package com.Project.Bank_System.repository;

import com.Project.Bank_System.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
