package ListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {


        ArrayList<String> obj1 = new ArrayList<String>();


        //Everytime when we use ArrayList Java default give you the Generic

        //Generic means specific Datatype (for e.g. in this we use String)

        //Other than this datatype will give compile error

        //Non-Generic will allow you other datatype under the single object (refer the eg in the package)

        obj1.add("Mukesh");

        obj1.add("Selenium");

        obj1.add("QTP HP");

        for (String abc : obj1) {
            System.out.println(abc);
        }


    }
}
