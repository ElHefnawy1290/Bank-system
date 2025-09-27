package com.Project.Bank_System.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account Created!";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created";


    public static String generateAccountNumber(){
        /*
         * 2025 + random 12 digits
         * */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        // generate random number between min and max

        int randNumber = (int) Math.floor(Math.random() * (max-min+1) + min);

        // convert the current year and random number to strings, then concatenate them

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();
        accountNumber.append(year);
        accountNumber.append(randomNumber);

        return accountNumber.toString();
    }
}
