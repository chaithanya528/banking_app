package com.chaithu.banking_app.mapper;

import com.chaithu.banking_app.dto.AccountDto;
import com.chaithu.banking_app.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getMobileNumber(),
                accountDto.getBalance(),
                accountDto.getAddress()
        );

        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance(),
                account.getMobileNumber(),
                account.getAddress()
        );

        return accountDto;
    }
}
