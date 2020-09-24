package com.pricetracking.ny.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "price_track")
public class PriceTrackEntity {

  private Long id;
  private Long userId;
  private String productUrl;
  private String productPrice;
  private String priceDate;
  private String productWebsite;
  private String productName;

  @Id
  @Column(name = "id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "user_id")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  @Column(name = "product_url")
  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  @Column(name = "product_price")
  public String getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }

  @Column(name = "price_date")
  public String getPriceDate() {
    return priceDate;
  }

  public void setPriceDate(String priceDate) {
    this.priceDate = priceDate;
  }

  @Column(name = "product_website")
  public String getProductWebsite() {
    return productWebsite;
  }

  public void setProductWebsite(String productWebSite) {
    this.productWebsite = productWebSite;
  }

  @Column(name="product_name")
  public String getProductName() {return productName; }

  public void setProductName(String productName){ this.productName = productName; }
}
