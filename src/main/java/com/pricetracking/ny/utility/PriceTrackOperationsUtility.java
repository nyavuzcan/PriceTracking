package com.pricetracking.ny.utility;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Objects;

public class PriceTrackOperationsUtility {

  public static String inquirePriceHepsiburada(String url) {
    Document document = null;
    try {
      document = Jsoup.connect(url).get();
    } catch (IOException e) {
      e.printStackTrace();
    }
    String price = null;
    String name = null;

    try {
      Element element = document.getElementsByClass("product-price-wrapper").get(0);

      price = element.getElementsByClass("extra-price").get(0).getElementsByTag("span").get(3).text();
      name = element.getElementsByClass("hide-title").get(0).getElementsByTag("span").get(1).text();


    } catch (Exception e) {
      e.printStackTrace();
    }

    if(Objects.nonNull(price) && Objects.nonNull(name))
      return price;

    return null;
  }

}
