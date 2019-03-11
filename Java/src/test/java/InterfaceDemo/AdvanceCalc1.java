package InterfaceDemo;

public class AdvanceCalc1 implements Calc{

    public static void main(String[] args) {


        Calc obj1 = new AdvanceCalc1();

        //Second valid scenario is
        //Create Reference of Base class or Interface and the Object of Child class
        //In that we cann access all the method of base class

        obj1.add();

        obj1.sub();

//        obj1.calculateSin();
//
//        obj1.calculateCos();

        //Same Scenario like Inheritance
        //Here Base class is Interace - Using that we can access only the Interface method only

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
