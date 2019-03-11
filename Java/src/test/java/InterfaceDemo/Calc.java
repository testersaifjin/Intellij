package InterfaceDemo;

public interface Calc {

    //What is Interface
    //How to write Interface
    //How to implement interface

    //Interface is special kind of class which contains variables and which cant be changed

    //It contains the method declaration only not the method body

    //In technical word - It has static constants and abstract methods only

    /* syntax:
    interface name

    {

    variable

    methods();

    }
     */

    //Four scenarios

    //1. Child class reference and child class object - This will allow to access all the methods of base class and child class

    //2. Base class reference and Base class object - This will allow to access all the methods of base class only

    //3. Base class reference and child class object - This will allow to access all the methods of base class only
    // and not child class method

    //4. Child class reference and Base class object - This will be invalid scenario. Child can not hold parent

    int x=10;

    //Declaring variable in Interface are by Default its "Final" Data type
    //And Final keyword cannot change in any other class

    public void add();
    public void sub();


}
