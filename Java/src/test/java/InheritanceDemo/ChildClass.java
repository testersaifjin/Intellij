package InheritanceDemo;

public class ChildClass extends BaseClass{

    public static void main(String[] args)
    {

        ChildClass obj1 = new ChildClass();

        obj1.add();

        obj1.sub();

        obj1.mul();

        obj1.div();

    }



    public void mul()
    {
        System.out.println("Hey I am in Child class and Mulitiplication is 2500");
    }

    public void div()
    {

        System.out.println("Hey I am in Child class and division is 50");

    }
}
