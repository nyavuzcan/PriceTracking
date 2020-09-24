package com.pricetracking.ny.dto;

public class PriceTrackResponse {
  private String price;
  private String message;
  private String name;

  public PriceTrackResponse() {
  }

  public PriceTrackResponse(String message) {
    this.message = message;
  }

  public PriceTrackResponse(String price, String message, String name) {
    this.price = price;
    this.message = message;
    this.name = name;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
