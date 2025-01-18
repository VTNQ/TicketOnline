package com.mg.webapi.Services;

import com.mg.webapi.DTOs.AccountDto;
import com.mg.webapi.Entities.Account;
import com.mg.webapi.Reposities.AccountRepository;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImplement implements AccountService{
    private AccountRepository accountRepository;

    @Override
    public Account Login(String username, String password) {
       Account account=accountRepository.findByEmail(username);
       if(account==null) return null;
       if(!BCrypt.checkpw(password, account.getPassword())) return null;
       return account;
    }

    @Override
    public boolean Register(AccountDto accountDto) {
        try {
            if(accountDto==null) return false;
            Account account=new Account();
            account.setFullName(accountDto.getFullName());
            account.setEmail(accountDto.getEmail());
            account.setPassword(BCrypt.hashpw(accountDto.getPassword(), BCrypt.gensalt()));
            account.setPhone(accountDto.getPhone());
            accountRepository.save(account);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
