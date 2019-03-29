package JavaProject;

import InheritanceDemo.ChildClass;
import JavaIntermediate.DynamicCalculator;

public class AdvanceCalculator {

    String name = "Mukesh";
    String hobby = "youtube";

    public static void sum()
    {
        System.out.println("It performs addition");
    }

    public static void subtraction()
    {
        System.out.println("It performs subtraction");

    }

    public static void main(String[] args)
    {
        DynamicCalculator obj2 = new DynamicCalculator();
        obj2.add(20, 20);
    }


}
