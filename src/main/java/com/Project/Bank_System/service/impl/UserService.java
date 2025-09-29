package com.Project.Bank_System.service.impl;

import com.Project.Bank_System.dto.BankResponse;
import com.Project.Bank_System.dto.CreditDebitRequest;
import com.Project.Bank_System.dto.EnquiryRequest;
import com.Project.Bank_System.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditDebitRequest creditDebitRequest);
}
