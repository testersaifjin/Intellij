package ListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args)
    {

        ArrayList obj1 = new ArrayList(); //N number of values u can add - there is no limit in Size or Type in this ArrayList

        obj1.add(676767);

        obj1.add("Male");

        obj1.add("Selenium WebDriver");

        obj1.add("Selenium WebDriver"); //ArrayList accept the duplicate values

        obj1.add(1245434.544);

        int myArraySize = obj1.size();
        System.out.println(myArraySize);

        for (int i=0; i<myArraySize;i++)
        {
            System.out.println("The ArrayList is "+obj1.get(i));
        }
    }
}
