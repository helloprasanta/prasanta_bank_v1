package com.pk.repository;

import com.pk.model.Withdraw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithdrawRepository extends JpaRepository<Withdraw, Integer> {
//    Withdraw findByClientEmail(String clientEmail);
}
