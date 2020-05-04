package com.pk.repository;

import com.pk.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
//    Manager findByClientEmail(String clientEmail);
}
