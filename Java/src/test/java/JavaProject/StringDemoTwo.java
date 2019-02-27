package JavaProject;

public class StringDemoTwo {

    public static void main(String[] args)
    {
        String name = "Welcome to the New Selenium world";

        String expected = "Welcome to the New Selenium World";

//equals method is case sensitive
//equalsignorecase method is not case sensitivie as longs as the content is same then the boolean value is true

        boolean result = name.equalsIgnoreCase(expected);
        System.out.println(result);
    }


}
