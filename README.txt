# Hibernate One-to-Many Mapping

## 📌 Project Overview
This project demonstrates the implementation of a **One-to-Many relationship** using **Hibernate ORM** with **Java** and **MySQL**.

In this project:
- One Department can have multiple Employees.
- Hibernate XML Mapping (`.hbm.xml`) is used.
- MySQL is used as the backend database.
- Maven is used for dependency management.

## 🛠 Technologies Used
- Java
- Hibernate ORM
- Maven
- MySQL
- Eclipse IDE

## 📂 Project Structure

```
src/
├── Dept.java
├── Emp.java
├── DeptEmpSaveClient.java
├── Emp.hbm.xml
└── hibernate.cfg.xml
```

## 🗄 Database
Database Name:

```
hibernate-ontomany
```

Tables:
- dept
- emp

## ▶️ How to Run

1. Create a MySQL database named `hibernate-ontomany`.
2. Configure the database username and password in `hibernate.cfg.xml`.
3. Run `DeptEmpSaveClient.java`.
4. Hibernate will create the required tables automatically.

## ✨ Features
- One-to-Many Mapping
- Many-to-One Mapping
- Hibernate SessionFactory
- Transaction Management
- Automatic Table Creation
- Cascade Operations

## 📸 Output

- Creates `dept` and `emp` tables.
- Inserts one department and multiple employee records successfully.

## 👩‍💻 Author

**Rishika Vangala**
