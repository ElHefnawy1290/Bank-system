package com.Project.Bank_System.service.impl;

import com.Project.Bank_System.dto.TransactionDetail;
import com.Project.Bank_System.entity.Transaction;
import com.Project.Bank_System.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDetail transactionDetail) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDetail.getTransactionType())
                .accountNumber(transactionDetail.getAccountNumber())
                .amount(transactionDetail.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction Saved Successfully");
    }
}
