# 🏦 Spring Boot Banking System

A robust backend REST API built with **Java** and **Spring Boot** that simulates core banking operations. This system handles account management, secure financial transactions, and generates automated email alerts and PDF bank statements.

## ✨ Key Features

* **User Account Management**
    * Create new bank accounts with auto-generated unique account numbers.
    * Perform Name and Balance Enquiries.
    * User data persistence using MySQL.
* **Financial Transactions**
    * **Credit & Debit:** Securely add or remove funds from accounts.
    * **Fund Transfers:** Transfer money between accounts with atomic transaction handling.
    * **Transaction History:** All transactions are logged and stored.
* **Notifications & Reporting**
    * **Email Alerts:** Automated email notifications for account creation, transfers, credits, and debits.
    * **PDF Bank Statements:** Generate transaction history statements (PDF format) and email them directly to the user using **iText PDF**.
* **Documentation**
    * Integrated **Swagger UI** for API testing and documentation.

## 🛠️ Technology Stack

* **Framework:** Spring Boot (Web, Data JPA)
* **Database:** MySQL
* **Documentation:** Swagger / OpenAPI
* **Utilities:** Lombok, iText PDF (for Statement Generation), JavaMailSender
* **Build Tool:** Maven

## 🚀 Getting Started

Follow these instructions to set up the project on your local machine.

### Prerequisites

* **Java 17** (or compatible JDK)
* **Maven**
* **MySQL Server**

### ⚙️ Configuration

Before running the application, you must configure your database and email credentials.

1.  Open `src/main/resources/application.properties`.
2.  Update the following configurations with your local details:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

# Email Configuration (for Alerts)
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

### 📦 Installation & Run

1. Clone the repository:
```
git clone [https://github.com/ElHefnawy1290/Bank-system.git](https://github.com/ElHefnawy1290/Bank-system.git)
cd Bank-system
```
2. Build the project:
```
mvn clean install
```
3. Run the application:
```
mvn spring-boot:run
```

## 📖 API Documentation (Swagger)
Once the application is running, you can access the interactive API documentation to test endpoints directly:

**URL**: `http://localhost:8080/swagger-ui/index.html`

## 👤 Author
**Amr Elhefnawy**

## 📝 License
This project is licensed under the MIT License.
