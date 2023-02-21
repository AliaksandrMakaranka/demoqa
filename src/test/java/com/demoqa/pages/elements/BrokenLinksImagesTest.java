package com.demoqa.pages.elements;


import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class BrokenLinksImagesTest {
  BrokenLinksImages blImages;
  WebDriver driver;
  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods
  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }
  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    blImages = new BrokenLinksImages(driver);
    blImages.setElementsLocator();
    blImages.setBrokenLinksImages();
  }

  @Test
  public void brokenImageTest() throws IOException {

    List<WebElement> webElementList = driver.findElements(By.tagName("img"));
    System.out.println(webElementList);

//    for (WebElement element : webElementList) {
//      String url1 = element.getAttribute("href");
////      URL url = new URL(url1);//why null? fixme
//      URL url = new URL(url1);
//      HttpURLConnection http = (HttpURLConnection) url.openConnection();
//      http.setConnectTimeout(2000);
//
//      int responseCode = http.getResponseCode();
//      String responseMessage = http.getResponseMessage();
//      String statusCodeResult =
//          "Response code for " + url + " is: " + responseCode + " " + responseMessage;
//
//      http.connect();
//      System.out.println(statusCodeResult);
//      http.disconnect();
//    }
    //todo need review

    for (WebElement element : webElementList) {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(element.getAttribute("src"));
      HttpResponse response = client.execute(request);
      System.out.println("request: " + request + " status code: " + response.getCode() + " "
          + response.getReasonPhrase());
    }

//    for (int i = 0; i < links.size(); i++) {
//      WebElement element = links.get(i);
//      String url = element.getAttribute("href");
//      System.out.println(url);
////      statusCode(url);
//    }
  }

  @Test
  public void statusCodeTest() throws IOException {
    statusCode("https://demoqa.com/broken");//fixme
  }
  private void statusCode(String httpURL) throws IOException {
    URL url = new URL(httpURL);
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

  @AfterEach
  void tearDown() {
//    Helper helper = new Helper(driver);
//    helper.tearDown();fixme
    if (driver != null) {
//      driver.close();
//      driver.quit();
      System.out.println("@AfterEach disabled");
    }
  }
}