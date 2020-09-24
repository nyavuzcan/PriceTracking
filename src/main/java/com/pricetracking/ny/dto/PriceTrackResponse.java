package com.pricetracking.ny.dto;

public class PriceTrackResponse {
  private String price;
  private String message;

  public PriceTrackResponse() {
  }

  public PriceTrackResponse(String message) {
    this.message = message;
  }

  public PriceTrackResponse(String price, String message) {
    this.price = price;
    this.message = message;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
