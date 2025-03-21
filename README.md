# LabAssign4_Visitor-Pattern
## E-commerce platform: Funiture

&emsp;&emsp; You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size. <br>

&emsp;&emsp; Each furniture type might have its own unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty adding new furniture types in the future. <br>

&emsp;&emsp; Implement a visitor design pattern approach. You must show the different elements of visitor design in your solution.  DO NOT USE ABSTRACT CLASSES. You are free to name your interfaces and concrete classes. Have a client code that will test your program. <br>

```
Visitable Interface: Funiture
Concrete Visible Class: FunitureItem
Visitor Interface: ShippingCostCalculator
Concrete Visitor Class: FunitureShipping
Client Class: FunitureShippingCostApp
```
## UML Class Diagram
![LabAssignment 4 - Visitor Pattern JRM _ 3BSCS-2](https://github.com/user-attachments/assets/a4d02558-d3a0-45c0-a0fc-20778f1580a7)
