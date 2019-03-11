package InterfaceDemo;

public class AdvanceCalc3 implements Calc{

    public static void main(String[] args) {

//3rd and 4th scenario is not Valid
        //AdvanceCalc1 obj2 = new Calc();

        //Again the Java not allowed to create Object of the Interface
        //This scenario is not valid - same reason because certain methods dont have the body
        //Java says - You can not create object of an Interface because it has abstract method

        //Abstract Method
        //What is Abstract method
        //Those method which don't have body is called abstract method

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
