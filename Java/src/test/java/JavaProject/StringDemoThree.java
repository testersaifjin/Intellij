package JavaProject;

public class StringDemoThree {

    public static void main(String[] args)
    {
        String actual = "Saifuddin Ziaudee Barakath Maths";

        String expected = "Ziaudee Barakath";

        boolean result = actual.contains("maths");
        System.out.println(result);
    }
}
