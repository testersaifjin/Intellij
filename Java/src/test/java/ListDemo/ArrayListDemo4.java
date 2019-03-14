package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList obj1 = new ArrayList(); //N number of values u can add - there is no limit in Size or Type in this ArrayList

        obj1.add(676767);

        obj1.add("Male");

        obj1.add("Selenium WebDriver");

        obj1.add("Selenium WebDriver"); //ArrayList accept the duplicate values

        obj1.add(1245434.544);

        Iterator itr = obj1.iterator();//Iterator is an Interface with the Abstract method hasnext(), next()

        while (itr.hasNext()) {
            Object value = itr.next();
            System.out.println(value);
        }

    }
}
