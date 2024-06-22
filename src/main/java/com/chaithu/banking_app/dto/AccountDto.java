package com.chaithu.banking_app.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private  Long id;
    private String accountHolderName;
    private double balance;
    private long mobileNumber;
    private String address;
}
