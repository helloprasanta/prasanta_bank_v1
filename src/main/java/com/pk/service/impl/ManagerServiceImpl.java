package com.pk.service.impl;

import com.pk.model.Manager;
import com.pk.repository.AccountRepository;
import com.pk.repository.ManagerRepository;
import com.pk.service.business.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerRepository managerRepository;


    @Override
    public Manager insertManager(Manager manager) {
        return null;
    }
}
