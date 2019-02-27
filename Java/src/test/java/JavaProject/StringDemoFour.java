package JavaProject;

public class StringDemoFour {


    public static void main(String[] args) {


        String fullname = "Selenium-Hp-Qtp-Grid";

        String[] array = fullname.split("-");

        for (int i=0; i<array.length;i++)
        {
            System.out.println("value for "+i+ " is "+array[i]);
        }

    }


}
