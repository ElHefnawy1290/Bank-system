package com.Project.Bank_System.service.impl;

import com.Project.Bank_System.dto.TransactionDetail;
import com.Project.Bank_System.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDetail transactionDetail);
}
