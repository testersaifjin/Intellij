package InterfaceDemo;

public class AdvanceCalc implements Calc {

    public static void main(String[] args) {


        AdvanceCalc obj1 = new AdvanceCalc();

        //Only Two scenarios will work - that is
        //Create object of Child class that is nothing but AdvanceCalc and access all the methods of Base class or Interface

        obj1.add();

        obj1.sub();

        obj1.calculateSin();

        obj1.calculateCos();

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
