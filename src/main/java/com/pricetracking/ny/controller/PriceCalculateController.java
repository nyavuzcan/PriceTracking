package com.pricetracking.ny.controller;

import com.pricetracking.ny.dto.PriceTrackResponse;
import com.pricetracking.ny.dto.UrlRequest;
import com.pricetracking.ny.service.PriceTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/price")
public class PriceCalculateController {
  @Autowired
  PriceTrackService priceTrackService;

  @RequestMapping(value = "/track", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<PriceTrackResponse> generateAlertPriceTrack(@RequestBody UrlRequest urlRequest) {
    return new ResponseEntity<>(priceTrackService.generateAlertPriceTrack(urlRequest), HttpStatus.OK);

  }

}
