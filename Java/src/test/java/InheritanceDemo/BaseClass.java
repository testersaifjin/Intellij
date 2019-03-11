package InheritanceDemo;

public class BaseClass {

    //What is Inheritance in java
    //Usage of Inheritance
    //How to inherit
    //Code

    //Inheritance is basic concept of OOP which will allow you to use parent class features.
    //Using Inheritance we can use parent class variable and method using child class object

    //Code reusability
    //No code duplication
    //For Method Overriding

    //Four Scenarios

    //1. Child class reference and child class object - This will allow to access all the methods of base class and child class

    //2. Base class reference and Base class object - This will allow to access all the methods of base class only

    //3. Base class reference and child class object - This will allow to access all the methods of base class only
    // and not child class method

    //4. Child class reference and Base class object - This will be invalid scenario. Child can not hold parent


    public void add()
    {
        System.out.println("Hey I am in Base class and addition is 250");
    }
    public void sub()
    {
        System.out.println("Hey I am in Base class and subtraction is 150");
    }

}
