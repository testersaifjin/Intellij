package JavaProject;

public class StringDemoFour {


    public static void main(String[] args) {


//        String fullname = "Selenium-Hp-Qtp-Grid";
//
//        String[] array = fullname.split("-");
//
//        for (int i=0; i<array.length;i++)
//        {
//            System.out.println("value for "+i+ " is "+array[i]);
//        }

        String fullname = "HP-Sql-Selenium-Java-Grid";

        String[] array = fullname.split("-");

        for (int i=0; i<array.length;i++)
        {
//            System.out.println("The array value of "+i+ " is "+array[i]);
            System.out.println(+i +"  " +array[i]);

            if (array[i].equalsIgnoreCase("hp"))
            {
                System.out.println("Test passed");
                break;
                //break is very important - if we dont give break then it will keep print even if the 1st condition met
                //it keep printing all the condition
                //if we give break - it will come out of the loop once the condition is passed

            }
        }

    }


}
