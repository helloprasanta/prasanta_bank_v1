package com.pk.repository;

import com.pk.model.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends JpaRepository<Deposit, Integer> {
//    Deposit findByClientEmail(String clientEmail);
}
