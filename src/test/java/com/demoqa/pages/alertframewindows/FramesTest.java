package com.demoqa.pages.alertframewindows;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FramesTest {
  WebDriver driver;
  Frames frames;
  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    frames = new Frames(driver);
    frames.setUpBeforeEach();
  }

  @Test
  void setSampleHeading() {
    frames.setSampleHeading();//fixme
  }
}