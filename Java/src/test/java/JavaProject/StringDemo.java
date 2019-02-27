package JavaProject;

public class StringDemo {

    public static void main(String[] args)
    {
        String name = "selenium webdriver";

        boolean status = name.startsWith("webdriver");
        System.out.println(status);

        String message = "Welcome to the Automation world";
        boolean endingcard = message.endsWith("world");
        System.out.println(endingcard);
    }
}
