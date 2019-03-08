package JavaIntermediate;

public class PassParameters {

    public static void main(String[] args)
    {

        PassParameters obj1 = new PassParameters();

        obj1.add(55, 78);

        obj1.sub(7855.054, 55.458);

    }

    public void add(int a, int b)
    {
        int c= a + b;

        System.out.println("The result is "+c);

    }
    public void sub(double x, double y)
    {

        double z=x-7;

        System.out.println("The result is "+z);

    }
}
