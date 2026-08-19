package OOP_Assignment;

// //superclass
// class vehical {
//     String brand;
//     void start() {System.out.println("vehical starting..!");}

// }
// //subclasses
// class car extends vehical {
//     String doors;
//     void honk() {System.out.println("beep beep");}
// }

// 1. Student
class Student {
    String name;
    int id;

    void study() {
        System.out.println("Studying...");
    }
}

class GraduateStudent extends Student {
    String researchTopic;

    void doResearch() {
        System.out.println("Doing research...");
    }
}

class UndergraduateStudent extends Student {
    int year;

    void attendClass() {
        System.out.println("Attending class...");
    }
}

// 2. Shape
class Shape {
    String color;

    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double width, height;

    double area() {
        return width * height;
    }
}

class Sphere extends Shape {
    double radius;

    double area() {
        return 4 * Math.PI * radius * radius;
    }
}

class Cube extends Shape {
    double side;

    double area() {
        return 6 * side * side;
    }
}

// 3. Loan
class Loan {
    double amount;
    double interestRate;
}

class CarLoan extends Loan {
    String carModel;
}

class HomeImprovementLoan extends Loan {
    String propertyAddress;
}

class MortgageLoan extends Loan {
    String propertyAddress;
    int termYears;
}

// 4. Employee
class Employee {
    String name;
    double salary;
}

class Faculty extends Employee {
    String department;

    void teach() {
        System.out.println("Teaching...");
    }
}

class Staff extends Employee {
    String role;

    void work() {
        System.out.println("Working...");
    }
}

// 5. BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;
}

class SavingsAccount extends BankAccount {
    double interestRate;
}