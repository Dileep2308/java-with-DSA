# Basics of Java

Java is a **high-level, object-oriented programming language** developed by Oracle Corporation. It is widely used for web applications, mobile apps (Android), desktop software, and enterprise systems.

## 1. Features of Java

* **Simple** – Easy to learn and use.
* **Object-Oriented** – Based on classes and objects.
* **Platform Independent** – "Write Once, Run Anywhere" (WORA).
* **Secure** – Provides built-in security features.
* **Robust** – Strong memory management and exception handling.
* **Multithreaded** – Supports concurrent execution.

---

## 2. Basic Java Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Output

```
Hello, World!
```

### Explanation

* `class` → Blueprint for creating objects.
* `main()` → Entry point of the program.
* `System.out.println()` → Prints output to the console.

---

## 3. Variables and Data Types

### Primitive Data Types

| Data Type | Example |
| --------- | ------- |
| int       | 10      |
| float     | 10.5f   |
| double    | 20.45   |
| char      | 'A'     |
| boolean   | true    |
| long      | 100000L |
| byte      | 100     |
| short     | 200     |

Example:

```java
int age = 20;
double salary = 50000.50;
char grade = 'A';
boolean passed = true;
```

---

## 4. Operators

### Arithmetic Operators

```java
int a = 10, b = 5;

System.out.println(a + b); // 15
System.out.println(a - b); // 5
System.out.println(a * b); // 50
System.out.println(a / b); // 2
System.out.println(a % b); // 0
```

### Comparison Operators

```java
a == b
a != b
a > b
a < b
a >= b
a <= b
```

---

## 5. Conditional Statements

### if-else

```java
int age = 18;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

### switch

```java
int day = 2;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid Day");
}
```

---

## 6. Loops

### for Loop

```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### while Loop

```java
int i = 1;

while(i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## 7. Arrays

```java
int[] numbers = {10, 20, 30, 40};

for(int num : numbers) {
    System.out.println(num);
}
```

---

## 8. Methods

```java
public class Test {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 3));
    }
}
```

Output:

```
8
```

---

## 9. Object-Oriented Programming (OOP)

### Class and Object

```java
class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;

        s1.display();
    }
}
```

### Four Pillars of OOP

1. **Encapsulation**
2. **Inheritance**
3. **Polymorphism**
4. **Abstraction**

---

## 10. Exception Handling

```java
try {
    int result = 10 / 0;
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

## 11. Java Collections

### ArrayList

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");

System.out.println(names);
```

---

## 12. Next Topics to Learn

After mastering the basics, learn:

1. Classes and Objects
2. Constructors
3. Inheritance
4. Interfaces
5. Collections Framework
6. Exception Handling
7. File Handling
8. Multithreading
9. JDBC (Database Connectivity)
10. Spring Framework

### Beginner Learning Path

**Java Syntax → Variables → Operators → Conditions → Loops → Arrays → Methods → OOP → Collections → Exception Handling → File Handling → JDBC → Spring**

If you're a complete beginner, I can also provide a **7-day Java study plan with practice programs**.
