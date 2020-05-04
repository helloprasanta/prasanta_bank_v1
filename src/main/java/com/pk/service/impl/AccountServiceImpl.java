package com.pk.service.impl;

import com.pk.model.Account;
import com.pk.repository.AccountRepository;
import com.pk.service.business.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;


    @Override
    public Account insertAccount(Account account) {
        return null;
    }
}
