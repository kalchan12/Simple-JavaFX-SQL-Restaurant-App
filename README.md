
# 🍽️  Simple JavaFX + SQL Restaurant App

Long before AI took over the scene, I built this small **JavaFX** project as a 2nd-year CS student.  
It’s a simple restaurant application that lets users **browse menu items, simulate payments**, and **log all orders into a SQL database**.

> 💡 This is *simple but honest work* — built with love, coffee, and plenty of student determination.

---

## ✨ Features
- Menu display with selectable items
- Add items to order
- Simulated payment system (frontend only)
- Logs all transactions into a SQL database
- View basic order history
- User registration and login
- Password reset functionality
- Favorite restaurant selection
- Alerts and feedback for user actions

---

## 🛠️ Tech Stack
- **JavaFX** — UI framework
- **SQL Database** — For storing orders
- **IntelliJ IDEA** — Development environment

---


## Project Structure
```
Database/
    Ethio_Food_Delivery Database.sql   # SQL schema and queries
login/
    src/
        main/
            java/
                com/example/login/
                    Dishes.java           # Handles dish ordering and navigation
                    Fav_Res.java         # Favorite restaurant navigation
                    Forgot.java          # Password reset logic
                    Application.java# Main JavaFX application entry point
                    login.java           # User login logic
                    payments.java        # Payment processing
                    registrations.java   # User registration logic
            resources/
                com/example/login/       # FXML files and images
```


## ⚠️ Important Notes
---

- This project was created and configured in **IntelliJ IDEA**.  
  Running it on other IDEs (like Eclipse or NetBeans) **may require configuration changes**.
- The **SQL API** and connection settings will differ depending on:
  - Your database type (MySQL, PostgreSQL, etc.)
  - Your local setup and drivers
- You may need to:
  - Update DB connection strings in the code
  - Add the correct JDBC driver to your project
  - Reconfigure your IDE build path

---