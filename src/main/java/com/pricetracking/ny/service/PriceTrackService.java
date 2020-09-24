package com.pricetracking.ny.service;

import com.pricetracking.ny.dto.PriceTrackResponse;
import com.pricetracking.ny.dto.UrlRequest;

public interface PriceTrackService {
  PriceTrackResponse generateAlertPriceTrack(UrlRequest urlRequest);
}
