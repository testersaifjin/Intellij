package InheritanceDemo;

public class ChildClass1 extends BaseClass {


    public static void main(String[] args) {

        BaseClass obj1 = new BaseClass();

        obj1.add();

        obj1.sub();

//        obj1.mul();
//
//        obj1.div();
//call the objecting using base class can't access the Child class methods
    }


    public void mul() {
        System.out.println("Hey I am in Child class and Mulitiplication is 2500");
    }

    public void div() {

        System.out.println("Hey I am in Child class and division is 50");

    }
}
