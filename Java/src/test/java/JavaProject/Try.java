package JavaProject;

import org.openqa.selenium.WebDriver;

public class Try {

    static WebDriver driver;


    static class Helper{
        private int data = 5;
        public void bump(int inc)
        {
            inc++;
            data = data + inc;
        }
    }

    static int count;
    static {
        System.out.println("In block 1");
        count=10;
    }

    private  int[] data;
     {
         int a;
        System.out.println("In block 2");
        data = new int[count];
        for (int i=0; i<count;i++)
        {
            data[i] = i;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Count = "+count);

        System.out.println("Before 1st call to new");
        Try test1 = new Try();
        System.out.println("Before 2nd call to new");
        Try test2 = new Try();


        Helper h = new Helper();
        int data = 2;
        h.bump(data);
        System.out.println(h.data + " " +data);


driver.getWindow

    }





}
