package JavaProject;

public class ClassDemo {

    int x = 100;
    int y = 90;

    public static void main(String[] args)
    {
        System.out.println("Start");
        ClassDemo obj1 = new ClassDemo();

        obj1.sum();
        System.out.println(obj1.x);
        System.out.println(obj1.y);

//creating another object with the same class - The new object creates again new memory space for variable X, Y
        ClassDemo obj2 = new ClassDemo();

        obj2.sum();
        System.out.println(obj2.x);
        System.out.println(obj2.y);
        System.out.println("End");
        System.out.println("End");



    }
//if our method is nonstatic - then we can call the method using Objects
    public void sum()
    {
        int a=5;
        int b=10;
        int c=a+b;

        System.out.println(c);
    }
}
