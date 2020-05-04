package com.pk.service.impl;

import com.pk.model.Transfer;
import com.pk.repository.AccountRepository;
import com.pk.repository.TransferRepository;
import com.pk.service.business.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferRepository transferRepository;


    @Override
    public Transfer insertTransfer(Transfer transfer) {
        return null;
    }
}
