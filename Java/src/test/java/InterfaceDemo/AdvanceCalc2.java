package InterfaceDemo;

public class AdvanceCalc2 implements Calc {

    public static void main(String[] args) {


        //Calc obj1 = new Calc();

        //Java not allow to create the Object of the Interface
        //Basic rule - we can create object of already created class with their properties (means its methods etc)
        //But in Interface - we don't create the body for the methods - so this reason java not allow to create obj using interface

        //so this scenario is INVALID
        //2. Base class reference and Base class object - This will allow to access all the methods of base class only

//        obj1.add();
//
//        obj1.sub();
//
//        obj1.calculateSin();
//
//        obj1.calculateCos();

    }

    public void calculateSin()
    {
        System.out.println("I am in Sin method");
    }

    public void calculateCos()
    {

        System.out.println("I am in Cos method");

    }

    public void add() {

        System.out.println("Im in Add method");

    }

    public void sub() {

        System.out.println("I am in sub method");

    }
}
