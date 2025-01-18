package com.mg.webapi.Services;

import com.mg.webapi.DTOs.AccountDto;
import com.mg.webapi.Entities.Account;

public interface AccountService {
    public Account Login(String username, String password);
    public boolean Register(AccountDto accountDto);
}
