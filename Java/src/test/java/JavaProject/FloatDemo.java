package JavaProject;

public class FloatDemo {

    public static void main(String[] args)
    {

        //This method is called Type casting - means we are forcefully store the double value in to float
        float mathsmark = (float) 60.89;

        float scienmark = 89.66f;

        double physicsmark = 4545.89;

        System.out.println("My new mark " +mathsmark);

        System.out.println("My new mark " +scienmark);

        System.out.println("My new mark " +physicsmark);


       //Array declaration
        int[] a = new int[1];

        a[0] = 55;
        System.out.println("The array is " + a[0]);


       //converting Type casting from Double to Integer - means 8 byet to 4 byte is called Downcasting
        //Downcasting - converting highter data type to lower data type
        int c = (int) 45.45;

        System.out.println(c);




    }
}
