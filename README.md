#Computer Programming I (Java)

This repository contains all coursework, lab implementations, and academic projects completed for **CSC111** (Computer Programming I) at King Saud University. The codebase highlights the engineering progression from structured procedural programming to modular Object-Oriented Programming (OOP) architectures.

---

## 📁 Repository Structure

### 1. `Parking-Reservation-System/` (Course Project)
A console-based parking slot reservation and administrative analytics system:
- **Phase 1 (`project_phase1.java`)**: 
  - Complete procedural implementation featuring role-based workflows (Customer vs. Parking Administrator).
  - Handles dynamic slot availability, tiered duration pricing, invoice generation, and transaction confirmation.
  - Built-in administrative analytics tracking total revenue and the most popular reservation durations.
- **Phase 2 Modularization (`ParkingSlot.java`)**:
  - Encapsulated slot entity modeling with custom constructors, state toggling (`reserve()`), and formatted status reporting.

### 2. `OOP-Implementations/`
Practical domain implementations highlighting core OOP principles (Encapsulation, Constructor Overloading, Static Members, and Object Referencing):
- **Package Delivery System (`Parcel.java`, `ParcelTest.java`)**: Dynamic shipping fee calculations based on weight, delivery tier (Standard vs. Express), and regional city transit times; tracks aggregate volume using static parcel counters.
- **Coffee Pricing & Forecasting (`Coffee.java`, `CoffeeTest.java`)**: Dynamic cup sizing and calorie scaling, compound annual price prediction (`predictPrice`), and target revenue cup computations (`cupsToTarget`).
- **Employee Management (`Employee.java`, `EmployeeDemo.java`)**: Tiered tenure bonus calculations and peer-to-peer salary comparison logic (`hasSameSalary`).
- **Retail Inventory & Costing (`FlowerShop.java`)**: Custom class instantiation, state mutations, and dynamic order pricing.
- **Passenger Verification (`Passenger.java`, `PassengerDemo.java`)**: State tracking and dynamic status confirmation workflows.

### 3. `Basics-and-Practice/`
Foundational exercises covering algorithm design, memory referencing, and string manipulation:
- **String Parsing & Extraction (`JavaProgram.java`, `StrLesson.java`, `Sheet2.java`, `Selection.java`)**:
  - Delimiter parsing (`indexOf`, `substring`) for timestamps (`HH:MM:SS` converted into total elapsed seconds).
  - Sequence detection verifying consecutive integer patterns from hyphenated inputs.
  - Multi-tier membership string decoding (`Selection.java`) calculating composite discount rates and formatted billing invoices.
- **Arrays & Memory References (`Test.java`, `TestArray.java`)**:
  - Array memory aliasing (`Test.java`), demonstrating that reference assignments point to identical heap addresses (`x == y` evaluating to `true`).
  - Dynamic array sizing, random number generation, and in-place compound conditional filtering (`TestArray.java`).
- **Methods & Control Flow (`Overload.java`, `isEvenMethod.java`, `mathrandom.java`)**:
  - Static method overloading resolving geometric areas (square vs. rectangle) based on parameter signatures.
  - Boolean predicate methods for numeric classification.

---

## 🛠️ Core Competencies
- **Object-Oriented Design:** Data Encapsulation, Access Modifiers, Constructor Overloading (`this` keyword), and Object Aliasing.
- **Memory & Pointers:** Deep vs. shallow copying in arrays and reference mutations.
- **String & Stream Parsing:** Zero-indexed character searching, slicing, and wrapper class conversions (`Integer.parseInt`).
