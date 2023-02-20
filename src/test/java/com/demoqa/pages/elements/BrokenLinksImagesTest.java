package com.demoqa.pages.elements;


import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
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

    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println(links);

    for (WebElement element : links) {
      String url1 = element.getAttribute("href");
      URL url = new URL(url1);//why null? fixme
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

//    for (WebElement element : links) {
//      HttpClient client = HttpClientBuilder.create().build();
//      HttpGet request = new HttpGet(element.getAttribute("href"));
//      HttpResponse response = client.execute(request);
//      System.out.println("request: " + request + " status code: " + response.getCode() + " "
//          + response.getReasonPhrase());
//    }
//
//    for (int i = 0; i < links.size(); i++) {
//      WebElement element = links.get(i);
//      String url = element.getAttribute("href");
//      System.out.println(url);
////      statusCode(url);
//    }
  }

  private void statusCode(String httpUrlLink) throws IOException {
    URL url = new URL(httpUrlLink);
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