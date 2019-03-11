package CompileTimePolymorphism;

public class CompileDemo {

//In this class we are going to discuss about Polymorphism
//Poly - means Many and Forms - called Poly Forms == Polymorphism
//Polymorphism - Run in 2 types - Method Overloading & Method Overriding
//Method Overloading - Compile Time & Early Binding
//Method Overriding - Run Time & Late Binding

//Polymorphism - E.g. - Same method [Add(), Add(int a, int b), Add(int a, int b, int c)

//Signature - This is also one of the concept to understand the Polymorphism
//Signature - means Number of Argument or Parameters we passed (also refer the above example for number of arguments)
//Java - normally not allowed to create a method in same name
//However - Method can be overloading if and only if method has the same name but with different signature
//Methods can only overloaded - with the same method name but the Different signature
//Signature - consists of 1. Number of argument 2. Type of argument and 3. Order of argument


    public static void main(String[] args)
    {


        //Same method we using multiple time with different signatures
        //signatures is nothing but Type of Number of Argument/Argument/Order of argument
        //This is called Method Overloading
        // This is also Known as Compile time Binding - Compile time itself we decide which method should be call
        //Before run the program itself the methods are bind with parameters



        CompileDemo obj1 = new CompileDemo();

        obj1.add(55, 45);
        obj1.add(55, 34, 66);
        obj1.add(5454.545, 4545.454);
        obj1.add(65, 454.45454);
        obj1.add(65.45454, 44);

    }

    public void add(int a, int b)
    {
        int c=a+b;

        System.out.println(c);
    }

    public void add(int a, int b, int c)
    {
        int sum=a+b+c;

        System.out.println(sum);
    }

    public void add(double a, double b)
    {
        double c=a+b;

        System.out.println(c);
    }

//Add integer number with double - the result is going to be double
//This is known as Internal Type casting - also known as Upcasting
//because Integer is converted in to Double
//If we add any datatype with Higher Data type then it converted into Higher Datatype



    public void add(int a, double b)
    {
        double c=a+b;

        System.out.println(c);
    }

    public void add(double a, int b)
    {
        double c=a+b;

        System.out.println(c);
    }



}
