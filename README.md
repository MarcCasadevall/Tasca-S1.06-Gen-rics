# Java Generics – Level 1 Exercises

**Description**:  
This project aims to introduce and reinforce the concept of **Generics in Java** by first working with a non-generic solution and then applying generic methods to understand their advantages in terms of flexibility, reusability, and type safety.

---

## 📌 Exercise Statement

### Exercise 1 — Class without Generics
Create a class called `NoGenericMethods` that stores three arguments of the same type, including:
- A constructor to initialize the values.
- Getter methods `getElement1()`, `getElement2()`, and `getElement3()` to access them.

Verify that the arguments can be passed to the constructor in any order.  
This exercise is intended to later compare the behavior with a generic version.

---

### Exercise 2 — Generic Method with Multiple Parameters
Create a `Person` class with the attributes `name`, `surname`, and `age`.

Then, create a class called `GenericMethods` with a generic method named `printElements()` that:
- Accepts three generic parameters.
- Prints those parameters to the console.

In the `main()` method of the main class, call this method using different parameter types (for example: a `Person` object, a `String`, and a primitive numeric value).

This exercise verifies that generic methods can accept any combination of types and in any order.

---

## ✨ Features

- Data storage without using generics (Exercise 1).
- Comparison between using `Object` and generic methods.
- Creation and usage of generic methods with multiple type parameters.
- Console output of different types of objects.
- Application of basic OOP and generics concepts in Java.

---

## 🛠 Technologies

- Backend: Java  
- Recommended IDE: IntelliJ IDEA / Eclipse  
- Version Control: Git  

---

## 🚀 Installation and Execution

1. Clone the repository:  
   ```bash
   git clone <repository-url>
