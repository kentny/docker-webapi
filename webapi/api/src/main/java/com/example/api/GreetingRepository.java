package com.example.api;

import com.example.api.entities.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface GreetingRepository extends JpaRepository<GreetingEntity, String> {
    GreetingEntity findFirstByLang(String lang);
}