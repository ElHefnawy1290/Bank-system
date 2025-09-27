package com.Project.Bank_System.service.impl;

import com.Project.Bank_System.dto.BankResponse;
import com.Project.Bank_System.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
