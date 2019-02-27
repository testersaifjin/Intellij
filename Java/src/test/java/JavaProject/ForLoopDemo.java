package JavaProject;

public class ForLoopDemo {

    public static void main(String[] args)
    {
        System.out.println("Loop started");
        for (int i=1; i<=20; i++)
        {

            System.out.println("The value of I is "+i);
        }
        System.out.println("Loop ended");

        //instead of i++ we can give i+2
        for (int i=0; i<=10; i=i+2)
        {
            System.out.println(i);
        }
    }


}
