package InheritanceDemo;

public class ChildClass2 extends BaseClass{

    public static void main(String[] args) {

        BaseClass obj1 = new ChildClass2();

        obj1.add();

        obj1.sub();

//        obj1.mul();
//
//        obj1.div();
        //Still using the Child class 2 oboject - but the reference is from Baseclass
        //Refering Base class will not access the Child class method

    }


    public void mul() {
        System.out.println("Hey I am in Child class and Mulitiplication is 2500");
    }

    public void div() {

        System.out.println("Hey I am in Child class and division is 50");

    }
}
