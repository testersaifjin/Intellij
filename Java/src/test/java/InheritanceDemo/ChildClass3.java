package InheritanceDemo;

public class ChildClass3 extends BaseClass {

    public static void main(String[] args) {

        //ChildClass obj1 = new BaseClass();

        //This scenario is invalid
        //Child cant hold the parent
        //But Parent can hold the child

//        obj1.add();
//
//        obj1.sub();
//
//        obj1.mul();
//
//        obj1.div();

    }


    public void mul() {
        System.out.println("Hey I am in Child class and Mulitiplication is 2500");
    }

    public void div() {

        System.out.println("Hey I am in Child class and division is 50");

    }
}
