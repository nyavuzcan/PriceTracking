package com.pricetracking.ny.repository;

import com.pricetracking.ny.entity.ConfirmationTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationTokenEntity,Long> {
}
