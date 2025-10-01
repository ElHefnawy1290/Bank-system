package com.Project.Bank_System.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TransactionDetail {
    private String transactionType;
    private BigDecimal amount;
    private String accountNumber;
    private String status;
}
