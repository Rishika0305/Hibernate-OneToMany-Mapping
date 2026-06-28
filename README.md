# Hibernate One-to-Many Mapping

## 📌 Project Overview

This project demonstrates the implementation of a **One-to-Manyrelationship** using **Hibernate ORM**, **Java**, and **MySQL**.

### Features
- One Department can have multiple Employees.
- Hibernate XML Mapping (`.hbm.xml`)
- MySQL database integration
- Maven dependency management
- Transaction management
- Automatic table creation

## 🛠 Technologies Used

- Java
- Hibernate ORM
- Maven
- MySQL
- Eclipse IDE

## 📂 Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── Dept.java
│   │   ├── Emp.java
│   │   └── DeptEmpSaveClient.java
│   └── resources/
│       ├── hibernate.cfg.xml
│       └── Emp.hbm.xml
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
2. Configure database username and password in `hibernate.cfg.xml`.
3. Run `DeptEmpSaveClient.java`.
4. Hibernate automatically creates the required tables.
5. Department and Employee records are inserted successfully.

## 🔗 Relationship

```
Department (1)
     │
     └────────► Employee (Many)
```

## 📷 Output

- Tables `dept` and `emp` are created.
- One department is inserted.
- Multiple employees are inserted.
- Foreign key relationship is maintained successfully.

## 👩‍💻 Author

**Rishika Vangala**
