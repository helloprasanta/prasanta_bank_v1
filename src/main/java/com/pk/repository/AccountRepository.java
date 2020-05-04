package com.pk.repository;

import com.pk.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
//    Account findByClientEmail(String clientEmail);
}
