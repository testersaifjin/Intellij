package JavaProject;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;

public class Try {

    public static void main(String[] args){

        ArrayList array = new ArrayList();

        array.add(10);
        array.add(20);
        array.add("saif");

        for (int i=0; i<array.size();i++)
        {
            System.out.println(+i+""+array.get(i));
        }
        System.out.println();

        Object arraysize = array.size();
        System.out.println(arraysize);

        for (Object newarray: array)
        {
            System.out.println(newarray);
        }

        Iterator itr = array.iterator();
        while (itr.hasNext())
        {
            Object value = itr.next();
            System.out.println(value);
        }


    }


}
