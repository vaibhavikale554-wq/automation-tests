# Sovio Registration and Login Selenium Tests

This project contains automated tests for the user registration and login functionality of the Sovio platform, located at [https://dev.sovio.id/](https://dev.sovio.id/).

The tests are built using:
- **Selenium WebDriver**: For browser automation.
- **TestNG**: As the testing framework.
- **Maven**: For project management and test execution.

## Prerequisites

Before running the tests, ensure you have the following installed:

1.  **Java Development Kit (JDK)**: Version 8 or higher.
2.  **Apache Maven**: To manage the project and run the tests.
3.  **Google Chrome**: The tests are configured to run using `ChromeDriver`.
4.  **ChromeDriver**: The WebDriver for Chrome must be installed and available in your system's PATH. Download the version that corresponds to your Chrome browser version from the [official ChromeDriver website](https://chromedriver.chromium.org/downloads).

## How to Run the Tests

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd selenium-tests-main
    ```

2.  **Run the tests using Maven:**
    Open a terminal or command prompt in the project's root directory and execute the following command:
    ```bash
    mvn clean test
    ```
    Maven will download the required dependencies, compile the code, and run the tests.

3.  **Test Reports:**
    After the tests have been executed, TestNG will generate test reports in the `target/surefire-reports` directory.
