# Advanced Java Patterns

## Overview
This repository contains various Java programs for printing different pattern designs using loops. Each pattern is implemented as a separate class inside the **`adv_patterns`** package, making it modular and easy to use.

## Patterns Included

| Pattern Name         | Class Name           | Description |
|----------------------|---------------------|-------------|
| Hollow Rectangle    | `HollowRectangle`   | Prints a hollow rectangle with given rows and columns |
| Inverted Triangle   | `InvertedTriangle`  | Prints an inverted right-angled triangle |
| Pyramid Number      | `PyramidNumber`     | Prints a decreasing pyramid of numbers |
| Floyd’s Triangle    | `FloydTriangle`     | Prints Floyd’s triangle with sequential numbers |
| 0-1 Triangle        | `ZeroOneTriangle`   | Prints a triangle of alternating 0s and 1s |
| Butterfly Pattern   | `ButterflyPattern`  | Prints a symmetrical butterfly pattern |
| Solid Rhombus       | `SolidRhombus`      | Prints a solid rhombus shape |
| Hollow Rhombus      | `HollowRhombus`     | Prints a hollow rhombus with a border |

## Folder Structure
```
adv_patterns/
│── HollowRectangle.java
│── InvertedTriangle.java
│── PyramidNumber.java
│── FloydTriangle.java
│── ZeroOneTriangle.java
│── ButterflyPattern.java
│── SolidRhombus.java
│── HollowRhombus.java
│── PatternTester.java
│── README.md
```

## Usage

### 1. Compilation
Ensure you have Java installed. Then, navigate to the project directory and compile all files:
```sh
javac adv_patterns/*.java
```

### 2. Running the Patterns
Run the `Test` class to execute all patterns:
```sh
java adv_patterns.Test
```

### 3. Using Individual Patterns
Each pattern function is static and can be called independently. Example:
```java
import adv_patterns.HollowRectangle;

public class Main {
    public static void main(String[] args) {
        HollowRectangle.hollow(4, 7);
    }
}
```

## License
This project is open-source and free to use.

## Contributions
Feel free to contribute new patterns or optimize existing ones by submitting a pull request.

## Contact
For any questions, reach out via GitHub issues. Happy coding! 🚀

