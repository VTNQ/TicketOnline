package com.mg.webapi.APIs;

import com.mg.webapi.DTOs.AccountDto;
import com.mg.webapi.Entities.Account;
import com.mg.webapi.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/accounts")
public class AccountAPI {

    @Autowired
    private AccountService accountService;
    @PostMapping("login")
    public ResponseEntity<Account> login(@RequestBody AccountDto account) {
        try {
            return new ResponseEntity<Account>(accountService.Login(account.getEmail(),account.getPassword()),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("register")
    public ResponseEntity<Boolean> register(@RequestBody AccountDto account) {
        try {
            return new ResponseEntity<>(accountService.Register(account),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
