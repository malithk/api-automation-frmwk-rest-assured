# API Automation Framework - REST Assured

Modern API test automation framework built using **Java 21**, **REST Assured**, **TestNG**, **Maven**, **Allure Reports**, **GitHub**, and **Jenkins CI/CD**.

## Features

* REST API automation using REST Assured
* Bearer Token Authentication
* TestNG test execution
* Maven build management
* Allure reporting
* Jenkins CI/CD integration
* GitHub version control
* Centralized configuration management
* Reusable utility components

## Technology Stack

| Technology   | Purpose                       |
| ------------ | ----------------------------- |
| Java 21      | Programming Language          |
| REST Assured | API Automation                |
| TestNG       | Test Execution                |
| Maven        | Build & Dependency Management |
| Postman      | API Design & Validation       |
| Allure       | Test Reporting                |
| Git & GitHub | Version Control               |
| Jenkins      | Continuous Integration        |



## Authentication Flow

```text
Login API
    ↓
Generate Access Token
    ↓
Store Token
    ↓
Bearer Authentication
    ↓
Authorized API Requests
```



## Generate Allure Report

```bash
allure serve allure-results
```

## CI/CD Flow

```text
GitHub
   ↓
Jenkins
   ↓
Maven
   ↓
TestNG
   ↓
Allure Report
```

---
Kudos "https://dummyjson.com/"

Built for API automation, reporting, and CI/CD execution using open-source technologies.
