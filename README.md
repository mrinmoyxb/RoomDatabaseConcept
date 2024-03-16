
# 🧑‍💼EmployeeVault

A simple Android application built using Kotlin, Jetpack Compose and Room Database to understand the concepts of Room Database in detail


## 🎯 Objectives

The main objective of this project is to understand the concepts of Room database in detail. 
## 🛠️ Technologies

* **`Kotlin`**
* **`Jetpack Compose`**
* **`Room Database`**
## 🎨 UI/UX
## 🔍 About Application

EmployeeVault is a simple Android application that takes three input from users: Name, Age and Designation. The application stores the values in the Room Database and displays the data from the database using Jetpack Compose

**`APPLICATION ARCHITECTURE PATTERN: `** 

* **`MVVM stands for Model-View-ViewModel`**, a software design pattern that helps separate the development of the graphical user interface (GUI) from the development of the business logic or back-end logic (the model). This separation of concerns can make it easier to develop and maintain complex applications.

  * **`Model:`** The model represents the data. It is responsible for storing data, processing data, and providing data to the view.

  * **`View:`** The view represents the user interface of an application. It is responsible for displaying data to the user and responding to user input.

  * **`View Model:`** The view model is a bridge between the model and the view. It is responsible for translating data from the model into a format that the view can understand.

**`ROOM DATABASE: `**

* Room is a persistence library, part of the Android Jetpack. A powerful library that simplifies database management in Android apps. Room provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.

* Room is now considered as a better approach for data persistence than SQLiteDatabase. It makes it easier to work with SQLiteDatabase objects in your app, decreasing the amount of boilerplate code and verifying SQL queries at compile time.

* Room Components: 

  * **`Database:`** This contains the database holder and serves as the primary access point for our app’s persisted, relational data. We use abstract class to create database.
  * **`Entity:`** A table in the database that is represented by an entity. Entity is genrally a data class. 
  * **`DAO:`** This class contains the methods for accessing the database. We use an interface to create DAO that stores all the queries. 
