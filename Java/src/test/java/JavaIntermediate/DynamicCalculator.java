package JavaIntermediate;

public class DynamicCalculator {

//In this method we don't need main method
//I am going to call this method in different class using Object

//We have 2 Non-Static method - 1 Static method on this class


    public static String getMyName(String firstname, String lastname)
    {
        String fullname = firstname+" "+lastname;

        return fullname;
    }

    public int add(int a, int b)
    {
        int c= a + b;

        return c;

    }
    public double sub(double x, double y)
    {

        double z=x-7;

        return z;

    }
}
