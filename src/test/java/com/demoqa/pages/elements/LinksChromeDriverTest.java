package com.demoqa.pages.elements;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Request;
import org.openqa.selenium.devtools.v85.network.model.Response;

class LinksChromeDriverTest {

  LinksChromeDriver linksChromeDriver;
  ChromeDriver chromeDriver;

  @BeforeEach
  void setUp() {
    chromeDriver = new ChromeDriver();
    linksChromeDriver = new LinksChromeDriver(chromeDriver);
//    linksChromeDriver.setWorkingPage();
    chromeDriver.manage().window().maximize();
  }

  @Test
  void setCreatedCode201Test() {
    DevTools devTools = chromeDriver.getDevTools();
    devTools.createSession();
    devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

    devTools.addListener(Network.requestWillBeSent(), request ->
        {
          Request req = request.getRequest();
          System.out.println(req.getUrl());
        }
    );

    devTools.addListener(Network.responseReceived(), response ->
        {
          Response res = response.getResponse();
          System.out.println(res.getUrl());
          System.out.println(res.getStatus());
        }
    );
    chromeDriver.get("https://demoqa.com/links");
    linksChromeDriver.setCreatedCode201();
    //todo make for one links
  }
}