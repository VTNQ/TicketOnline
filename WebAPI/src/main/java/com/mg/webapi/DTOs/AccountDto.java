package com.mg.webapi.DTOs;

import java.io.Serializable;

/**
 * DTO for {@link com.mg.webapi.Entities.Account}
 */
public class AccountDto implements Serializable {
    private Integer id;
    private String fullName;
    private String email;
    private String phone;
    private String accountType;
    private String password;

    public AccountDto() {
    }

    public AccountDto(Integer id, String fullName, String email, String phone, String accountType, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.accountType = accountType;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}