package JavaProject;

public class StringDemoThree {

//In String Demo - we have covered Startwith/Endwith/Contains/Split expression/Trim
//All are explained with simple example in a separate class

    public static void main(String[] args)
    {
        String actual = "Saifuddin Ziaudee Barakath Maths";

        String expected = "Ziaudee Barakath";

        boolean result = actual.contains("maths");
        System.out.println(result);
    }
}
