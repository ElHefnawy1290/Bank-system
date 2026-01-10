# 🏦 Secure Banking System API

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Swagger](https://img.shields.io/badge/Docs-Swagger%2FOpenAPI-brightgreen)

## 📜 Project Description
A robust, full-stack banking backend application built with **Java Spring Boot**. This system handles core financial operations including account management, secure fund transfers, and real-time balance inquiries. It features an automated **PDF Bank Statement generator** and an **Email Notification System** to alert users of transaction activities.

The project follows the **MVC Architecture** and utilizes **Data Transfer Objects (DTOs)** to ensure a clean separation between the internal database entities and the external API responses.

## 🚀 Key Features
* **User Account Management:** Create accounts, update details, and manage user state (Active/Inactive).
* **Financial Transactions:** Secure Credit, Debit, and Transfer operations with validation checks.
* **Real-time Notifications:** Automated email alerts for every transaction using **JavaMailSender**.
* **Statement Generation:** dynamically generates PDF bank statements for specific date ranges using **iTextPDF**.
* **Documentation:** Fully documented API using **Swagger UI**.

## 🛠️ Tech Stack
* **Backend Framework:** Spring Boot (Spring Web, Spring Data JPA)
* **Database:** MySQL
* **Tools:** Lombok, Maven, Postman
* **Documentation:** SpringDoc OpenAPI (Swagger)
* **Utilities:** iTextPDF (PDF Generation), JavaMailSender (SMTP)

## 📂 Project Structure
```text
src/main/java/com/Project/Bank_System
├── controller    # REST Controllers (API Endpoints)
├── dto           # Data Transfer Objects (Request/Response)
├── entity        # JPA Entities (Database Tables)
├── repository    # Spring Data JPA Repositories
├── service       # Business Logic & Interfaces
└── utils         # Helper classes (Account Generators)
