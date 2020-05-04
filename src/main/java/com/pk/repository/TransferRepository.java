package com.pk.repository;

import com.pk.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Integer> {
//    Transfer findByClientEmail(String clientEmail);
}
