package com.pricetracking.ny.repository;

import com.pricetracking.ny.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
  UserEntity findByEmail(String email);
}
