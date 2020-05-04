package com.pk.service.impl;

import com.pk.model.Branch;
import com.pk.repository.AccountRepository;
import com.pk.repository.BranchRepository;
import com.pk.service.business.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchRepository branchRepository;


    @Override
    public Branch insertBranch(Branch branch) {
        return null;
    }
}
