package com.demoqa.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class Helper {


  public void statusCode(String httpUrlLink) throws IOException {
    URL url = new java.net.URL(httpUrlLink);
    HttpURLConnection http = (HttpURLConnection) url.openConnection();
    http.setConnectTimeout(2000);

    int responseCode = http.getResponseCode();
    String responseMessage = http.getResponseMessage();
    String statusCodeResult =
        "Response code for " + url + " is: " + responseCode + " " + responseMessage;

    http.connect();
    System.out.println(statusCodeResult);
    http.disconnect();
  }
}
