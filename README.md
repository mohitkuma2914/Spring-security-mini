# 🔐 Spring Security Role-Based Authentication Project

This is a Spring Boot project demonstrating basic authentication and role-based authorization using Spring Security.

---

## 🚀 Features

- Form-based Login
- In-Memory Authentication
- Role-Based Authorization
- Public and Protected Endpoints

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Security
- Maven

---

## 👥 Users (In-Memory)

| Username | Password      | Role     |
|----------|--------------|----------|
| kohli   | kohli@1234   | STUDENT  |
| rohit   | rohit@1234   | ADMIN    |

---

## 🔗 Endpoints

| URL        | Access        |
|------------|--------------|
| /home      | Public        |
| /student   | STUDENT role |
| /admin     | ADMIN role   |

---

## 🔐 Security Configuration

- CSRF Disabled
- Role-based access control
- Default Spring Security login form

---

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ / Eclipse
3. Run the main application class
4. Visit: http://localhost:8080/home

---

## 📚 Learning Outcome

- Understanding Spring Security basics
- Authentication vs Authorization
- SecurityFilterChain configuration
- InMemoryUserDetailsManager usage

---

## 👨‍💻 Author

Mohit Kumar

