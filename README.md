# CSC6301 – Project 04  
## Flexible Notification System (Composition-Based Design)

### Author
Erika Coreth  

---

## Project Overview

This project implements a Flexible Notification System using **composition instead of inheritance**.  

The goal of the assignment was to design a system that is easy to maintain and extend when requirements change — without rewriting the core logic.

Rather than building a rigid inheritance hierarchy, this implementation uses a `NotificationMedium` interface and dynamically swaps implementations at runtime. This makes the system flexible, scalable, and aligned with SOLID principles.

---

## Learning Objectives

- Understand **Composition vs. Inheritance**
- Apply the **Open-Closed Principle**
- Implement runtime behavior changes
- Practice professional-grade **JavaDoc documentation**
- Compile and run the application using only the **Command Line Interface (CLI)**
- Use Java’s **Collection Framework** (`ArrayList`) for session logging

---

## Architecture & Design

### Interface

`NotificationMedium`  
Defines the contract:

```java
void send(String message);
```

---

### Concrete Implementations

- `EmailService`
- `SMSService`

Both implement `NotificationMedium` and provide their own `send()` behavior.

---

### Container Class

`AlertSystem`

Responsibilities:
- Holds a `NotificationMedium` field
- Allows runtime swapping via:

```java
setMedium(NotificationMedium medium)
```

- Sends notifications via:

```java
notifyUser(String message)
```

- Maintains a session log using:

```java
ArrayList<String> log;
```

---

## Why Composition Matters (Maintenance Perspective)

This design allows new features to be added without modifying the existing system.

For example:
If a new notification type (e.g., WhatsApp) is required, a new class implementing `NotificationMedium` can simply be added.

No core logic needs to be rewritten.

This keeps the system:
- Extensible
- Maintainable
- Less brittle
- Compliant with the Open-Closed Principle

---

## Collection Framework Usage

The `AlertSystem` class uses:

```java
ArrayList<String>
```

to maintain a session-based log of all notifications sent during runtime.

This demonstrates use of the Java Collection Framework for state management.

---

## 📖 Professional Documentation

All classes and interfaces include professional JavaDocs with:

- `@author`
- `@param`
- `@return`
- Class-level documentation
- Method-level documentation

Documentation was written to ensure a reasonably competent developer could understand and maintain the system without additional explanation.

---

## 💻 How to Compile (CLI)

From the project directory:

```bash
javac *.java
```

---

## ▶ How to Run (CLI)

```bash
java Main
```

The program will:
1. Set a notification medium
2. Send messages
3. Log messages internally
4. Display output to the console

---

## 📂 Repository Structure

```
.
├── NotificationMedium.java
├── EmailService.java
├── SMSService.java
├── AlertSystem.java
├── Main.java
└── README.md
```

---

## Ownership Readiness

This repository includes:
- Fully documented source code
- Clear compile and execution instructions
- Modular, extensible design
- Clean separation of responsibilities

A developer should be able to clone, compile, run, and extend this project without contacting the original author.

---

## Key Concepts Demonstrated

- Composition over Inheritance
- Interface-based design
- Runtime polymorphism
- SOLID principles
- Maintainability-focused architecture
- CLI-based execution
- Professional documentation standards
