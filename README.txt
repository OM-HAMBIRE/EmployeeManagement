Employee Management Application - README

## Table of Contents
1. Introduction
2. Prerequisites
3. How to Run the Project
4. Database Setup

---

## 1. Introduction
This is an Employee Management application built using Spring Boot and MongoDB. The application allows you to perform CRUD operations on employee records and send an email to the Level 1 manager when a new employee is added.

## 2. Prerequisites
Before running the application, make sure you have the following prerequisites installed on your system:
- Java Development Kit (JDK) 11 or higher
- Apache Maven
- MongoDB (You can download and install MongoDB from https://www.mongodb.com/try/download/community)

## 3. How to Run the Project
Follow the steps below to run the Employee Management application:

1. Clone the repository to your local machine using Git:


2. Navigate to the project directory:

3. Build the project using Maven:

4. Run the application:

5. The application will start, and you can access it at http://localhost:8080

## 4. Database Setup
Make sure you have MongoDB installed and running on your local machine. If you have not installed MongoDB, download and install it from https://www.mongodb.com/try/download/community

Once MongoDB is installed, you can follow these steps to set up the database for the Employee Management application:

1. Start MongoDB:
- On Windows: Open Command Prompt and run `mongod`
- On macOS/Linux: Open Terminal and run `mongod`

2. Create a new MongoDB database named 'mydb':
- Open a new terminal or command prompt window
- Run the following command:
  ```
  mongo
  ```

3. In the MongoDB shell, create the 'mydb' database:

4. The database setup is complete. The Employee Management application will automatically connect to the 'mydb' database using the MongoDB URI specified in the 'application.properties' file.

---

That's it! You have successfully set up and run the Employee Management application. If you have any questions or encounter any issues, feel free to contact us.

Happy managing!

Name:- Om Hambire
Email Id:- omhambire08@gmail.com 