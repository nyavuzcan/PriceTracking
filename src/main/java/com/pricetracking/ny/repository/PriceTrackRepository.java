package com.pricetracking.ny.repository;

import com.pricetracking.ny.entity.PriceTrackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceTrackRepository extends JpaRepository<PriceTrackEntity, Long> {


}
