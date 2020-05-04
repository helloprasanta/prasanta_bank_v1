package com.pk.service.impl;

import com.pk.model.Deposit;
import com.pk.repository.AccountRepository;
import com.pk.repository.DepositRepository;
import com.pk.service.business.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositServiceImpl implements DepositService {
    @Autowired
    private DepositRepository depositRepository;


    @Override
    public Deposit insertDeposit(Deposit deposit) {
        return null;
    }
}
