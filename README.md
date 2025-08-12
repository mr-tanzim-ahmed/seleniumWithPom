# Web Automation Testing

URL: https://parabank.parasoft.com/parabank/index.htm
Language: Java
Automation Library:Selenium WebDriver
Testing Library: TestNG
Reporting Library: ExtentReports 

#File Structure:
<pre> <code> 
  src
    └── test
        └── java
            └── com
            │   └── parabank
            │       └── parasoft
            │           ├── pages
            │               ├── AccountOpenedPage.java
            │               ├── BasePage.java
            │               ├── BillPaymentCompletePage.java
            │               ├── BillPaymentPage.java
            │               ├── CustomerLookupPage.java
            │               ├── LoginPage.java
            │               ├── OpenNewAccountPage.java
            │               ├── OverviewPage.java
            │               ├── Page.java
            │               └── RegisterPage.java
            │           ├── report
            │               ├── ReportManager.java
            │               ├── ReportTestManager.java
            │               └── TestListener.java
            │           ├── testCases
            │               ├── BaseTest.java
            │               ├── BillPaymentTest.java
            │               ├── CustomerLookupTest.java
            │               ├── LoginTest.java
            │               ├── OpenNewAccountTest.java
            │               └── RegisterTest.java
            │           └── util
            │               └── ParaBankUtil.java
         resources
            ├── config.properties
            ├── regressionSuite.xml
            └── regressionSuiteWithReport.xml
</code> </pre>
