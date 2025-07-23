# 🛠️ Issue Tracker (Console-based)

This is a simple **Java console application** built with **Spring Boot structure and Maven**, demonstrating core **object-oriented programming (OOP)** principles like **inheritance**, **interface implementation**, and **polymorphism**.

---

## 🎯 Project Objective

Simulate a basic Issue Tracker that handles different types of issues like **bugs** and **tasks**, showcasing:

- 🔁 Inheritance and Method Overriding  
- 🧩 Interface-based design  
- 🧠 Runtime polymorphism — without using `instanceof`

All logic is implemented inside the `main()` method for simplicity — no REST endpoints or Spring Boot MVC used.

---


---

## 📦 Class & File Breakdown

### 🔹 `Reportable.java`
- An **interface** that declares a method `reportStatus()`.
- Enforces that every issue (e.g., Bug, Task) must define how its status is reported.

---

### 🔹 `Issue.java`
- An **abstract base class** that represents a general issue.
- Implements the `Reportable` interface.
- Declares:
  - Common fields: `title`, `description`
  - Abstract method: `display()` to be overridden by child classes
  - Inherited method: `reportStatus()` to be implemented by all subclasses

---

### 🔹 `Bug.java`
- Extends `Issue`, representing a software bug.
- Has an additional field: `severity`
- Overrides:
  - `display()` — prints bug details
  - `reportStatus()` — shows how the bug is reported

---

### 🔹 `Task.java`
- Extends `Issue`, representing an assignable task.
- Has an additional field: `assignee`
- Overrides:
  - `display()` — prints task details
  - `reportStatus()` — shows how the task is handled

---

### 🔹 `IssueTrackerApplication.java`
- The main entry point of the application.
- Inside `main()`:
  - Creates a list of `Issue` objects (both `Bug` and `Task`)
  - Calls `display()` and `reportStatus()` on each item
  - Demonstrates **polymorphism**: methods behave based on actual object type

---

## ✅ Features Demonstrated

| Concept                  | Implementation Example                            |
|--------------------------|----------------------------------------------------|
| Inheritance              | `Bug` and `Task` extend `Issue`                   |
| Interface Implementation | `Issue` implements `Reportable`                   |
| Method Overriding        | `display()` and `reportStatus()` in each subclass |
| Polymorphism             | `List<Issue>` and dynamic method dispatch         |
| No `instanceof` used     | Clean interface-based polymorphism                |

---

## 💻 How to Run

1. Ensure you have JDK 17+ and Maven installed.
2. Clone or download the project.
3. Navigate to the root directory.
4. Compile and run using:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.issuetracker.IssueTrackerApplication"

