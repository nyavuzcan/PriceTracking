package com.pricetracking.ny.repository;

import com.pricetracking.ny.entity.PriceTrackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceTrackRepository extends JpaRepository<PriceTrackEntity, Long> {


}
