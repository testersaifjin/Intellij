package JavaProject;

public class IfElseDemo {

    public static void main(String[] args)
    {
        System.out.println("Test Start");
        String browser;
        browser = "chrome";

        if (browser.equalsIgnoreCase("chrome"))
        {
            System.out.println("Test case executed on chrome");
        }
        else
        {
            System.out.println("Test case executed on firefox");
        }
        System.out.println("Test End");
    }
}
