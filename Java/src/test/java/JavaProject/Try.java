package JavaProject;

import org.openqa.selenium.WebDriver;

public class Try {

    public static void main(String[] args){

        int[][] array = new int[2][2];

        array[0][0] = 10;
        array[0][1] = 20;

        array[1][0] = 30;
        array[1][1] = 40;

        int arraysize = array.length;
        System.out.println(arraysize);

        for (int i=0; i<array.length;i++)
        {
            for (int j=0; j<array[i].length;j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }


}
