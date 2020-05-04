package com.pk.service.impl;

import com.pk.model.Withdraw;
import com.pk.repository.AccountRepository;
import com.pk.repository.WithdrawRepository;
import com.pk.service.business.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WithdrawServiceImpl implements WithdrawService {
    @Autowired
    private WithdrawRepository withdrawRepository;


    @Override
    public Withdraw insertWithdraw(Withdraw withdraw) {
        return null;
    }
}
