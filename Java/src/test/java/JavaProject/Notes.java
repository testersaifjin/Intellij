package JavaProject;

public class Notes {

    //Variable - Variable is a name of memory location to store values
    //Variable - use to store data and use the data once it is required

    //Datatype Two types - 1. Primitive data type 2. Non Primitive data type
    //Primitive Data type - boolean (true or false), char, byte, short, int, long, float, double

    //char - this is a data type - and it will accept single character i.e. A, B, C, D etc.
    //char - will use the Unicode - means this Char value is same in all languages Refer: http://www.asciitable.com/
    //char - we can directly assign the characters or by decimal value Refer charDemo class
    //char - using unicode - whatever keyboard using i.e. chinese keyboard, japanese keyboard - char value will never change

    //byte - 1 byte, short - 2 byte, int - 4 byte, long - 8 byte
    //based on the decimal value we have to choose the data type efficiently - to make our app works faster
    //we can give long - 8 byte - for all- I know long contain all - because it have long memory space - but that is not the efficient way
    //also it is not the best practice of utilising memory wisely
    //As a developer - we try to save the memory space of our application

    //float - 4 byte - for e.g. float a = 60.89 - still java throws error
    //By default java will consider any fractional value as double data type - because java dont want to lose any data
    //for this Java also giving two options - called Type casting - that will forcely decalare the franction value as float
    //like float a = (float) 60.89; || float a = 60.89f;
    //double is very straight forward - it contains 8 byte - and it declare as double my_marks = 4545.89;
    //another one for e.g. floating/double value in to integer int a= (int) 45.45; using type casting for the fractional value
    //Then the output is it will only recognize the integer part - not the fractional value
    //also in this float/double to int - also called as downcasting - why because it reduce the fractional value 8byte to int value 4 byte
    //also we will discuss about the Upcasting - that less byte in to high memory


    //Non Primitive data type - String, Arrays, Classes, Interfaces etc

    //Local variable and Global variable
    //Local variable - also contains garbage values but Global variable by default assigned NULL or any other value
    //Local variable - is the variable define in the method
    //Local variable - if you define some value for eg int a; and if we print sout(a) - java doesn't allow and java think it as a Garbage variable
    //Throws error message says that the value is only defined not initialize
    //Global variable - is the variable define in the class level - also if you not initialize any value for this global variable
    //Java default assume as NULL or 0 for that Global variable

    //What is loop
    //For loop
    //While loop
    //Do while loop
    //Enhanced for loop/ For each loop - since java 1.5 - it implement this loop

    //Loop - Its a general concept in any Programming language which will allow to run certain piece of run multiple times
    //Read 100 rows from an excel
    //Fetch 500 records from database

    //While loop - is an another loop control and it will only execute if condition is true
    //Selenium e.g. - if excel sheet has some rows then print the excel sheet

    //Do While - is a loop - will print once before check the condition - Refer the e.g.

    //Conditional/Decision Statement
    //It gives the power to take decision when to execute and what to be done of condition true
    //e.g. Fetch the database record of database connection successfull
    // e.g. Run Test case if browser does not equals to null
    //Fetch the records if excel file exist


    //Switch statement
    //Data type should be same
    //We can use Mulitple cases
    //We can use only Integers String and Enums
    //Break is optional but if not provided it will check all cases till the end
    //Default is option

    //Classes and Methods
    //Class - Method - Object

    //Class - A class is nothing but a blueprint or a template for creating different objects which defines its properties and behaviors
    //Class - Class is an entity which binds data member and member methods into single unit
    //Data member is nothing but - data types what we using i.e. Int, Float, Decimal, Long, Short, String...
    //Member Methods means - calculateEMI, calcuateMarks
    //Class is a best example of encapsulation - Encapsulate everything in to a single unit


    //Methods
    //Method is just a block of java statment that performs a particular task
    //Methods will increase the Re-Usability of the program and it will avoid Code duplicating
    //Methods can be called using (.) operator

    //String is a class belong to java.lang.String
    //String class has many inbuilt methods which will help to perform operations on Strings
    //Comparing, converting, split, concatenate and so on
    //String Methods - startsWith(), endsWith() which will retur true/false






}
