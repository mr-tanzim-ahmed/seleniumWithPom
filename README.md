# ParaBank Selenium UI Tests

This project is a Java UI automation suite for the [ParaBank demo banking application](https://parabank.parasoft.com/parabank/index.htm). It uses Selenium WebDriver, TestNG, and the Page Object Model. ExtentReports is available for runs that use the report-enabled TestNG suite.

## Requirements

- JDK 17 or newer
- A supported browser installed: Chrome, Firefox, or Microsoft Edge
- Internet access to reach ParaBank; Selenium Manager can manage the matching browser driver

Gradle is included through the Gradle Wrapper, so a separate Gradle installation is not required.

## Configuration

Update `src/test/resources/config.properties` before running the tests:

```properties
baseURL=https://parabank.parasoft.com/parabank/index.htm
username=sqa
password=sqa
browser=chrome
```

`browser` must be `chrome`, `firefox`, or `edge`. The configured username and password are used by tests that need an existing ParaBank account. Registration tests create a new account on the demo site.

## Running the tests

Run the automatically discovered TestNG tests:

```shell
./gradlew test
```

On Windows, use the batch wrapper:

```powershell
.\gradlew.bat test
```

Run a specific TestNG suite by its XML filename without the `.xml` extension:

```shell
./gradlew test -Ptestng.suites=regressionSuite
```

Run the suite with ExtentReports enabled:

```shell
./gradlew test -Ptestng.suites=regressionSuiteWithReport
```

Multiple suites can be comma-separated, for example:

```shell
./gradlew test -Ptestng.suites=regressionSuite,regressionSuiteWithReport
```

## Reports

Gradle writes the standard TestNG test results to `build/reports/tests/test/index.html` and machine-readable results to `build/test-results/test/`. When using `regressionSuiteWithReport`, the ExtentReports HTML report is written to `build/extendReport/Report.html`.

## Test coverage

The test cases under `src/test/java/com/parabank/parasoft/testCases` cover:

- Login page checks, successful login, and invalid login attempts
- Registration page and form validation
- Customer lookup page
- Opening a savings account
- Funds transfer success and validation
- Bill payment

The page objects are in `pages`, report listeners and helpers are in `report`, shared browser setup is in `testCases/BaseTest.java`, and shared constants are in `util/ParaBankUtil.java`.

## Project layout

```text
src/test/java/com/parabank/parasoft/
├── pages/       Page objects and page-level actions
├── report/      TestNG listener and ExtentReports helpers
├── testCases/   Test classes and shared test setup
└── util/        Shared test constants and utilities
src/test/resources/
├── config.properties
├── regressionSuite.xml
└── regressionSuiteWithReport.xml
```
