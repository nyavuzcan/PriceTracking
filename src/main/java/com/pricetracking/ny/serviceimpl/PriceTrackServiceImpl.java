package com.pricetracking.ny.serviceimpl;

import com.pricetracking.ny.dto.PriceTrackResponse;
import com.pricetracking.ny.dto.UrlRequest;
import com.pricetracking.ny.service.PriceTrackService;
import com.pricetracking.ny.utility.PriceTrackOperationsUtility;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class PriceTrackServiceImpl implements PriceTrackService {
  @Override
  public PriceTrackResponse generateAlertPriceTrack(UrlRequest urlRequest) {
    String price = PriceTrackOperationsUtility.inquirePriceHepsiburada(urlRequest.getUrl());
    if (Objects.nonNull(price)){
      return new PriceTrackResponse(price, "Alert successfully saved");
    }
    return  new PriceTrackResponse("ALERT_SAVED_ERROR");
  }
}
