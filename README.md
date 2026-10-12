# DemoQA UI Test Automation

Automated UI tests for [demoqa.com](https://demoqa.com/), a practice site with typical web elements: forms, tables, alerts, frames, windows, file upload and more.

**Stack:** Java 17 · Selenium 4 · JUnit 5 · AssertJ · WebDriverManager · Allure · Log4j2 · JavaFaker · Maven

## What is covered

40 automated tests across three areas of the site:

| Area | Pages under test |
|---|---|
| **Elements** | Text Box, Check Box, Radio Button, Web Tables, Buttons, Links, Broken Links & Images, Upload & Download, Dynamic Properties |
| **Alerts, Frames & Windows** | Alerts, Browser Windows, Frames, Modal Dialogs |
| **Widgets** | Date Picker |

## Project structure

```
src/
├── main/java/com/demoqa/pages/     # Page Objects (one class per page)
│   ├── BasePage.java, CommonActions.java
│   ├── elements/
│   ├── alertframewindows/
│   └── widgets/
└── test/java/com/demoqa/pages/     # Tests, mirroring the page structure
    ├── DriverFactory.java          # WebDriver setup
    └── Helper.java
```

The project follows the **Page Object** pattern: locators and page actions live in page classes, tests only describe the scenario and the checks. Test data (names, e-mails, addresses) is generated with JavaFaker.

## Running the tests

Requirements: JDK 17+, Maven, Google Chrome.

```bash
git clone https://github.com/AliaksandrMakaranka/demoqa.git
cd demoqa
mvn test
```

### Allure report

Test results are written to `target/allure-results`. With the [Allure CLI](https://allurereport.org/docs/install/) installed:

```bash
allure serve target/allure-results
```

---

### 🇵🇱 Opis

Automatyczne testy UI dla serwisu demoqa.com: 40 testów (formularze, tabele, alerty, ramki, okna, upload plików). Java, Selenium, JUnit 5, wzorzec Page Object, raporty Allure.
