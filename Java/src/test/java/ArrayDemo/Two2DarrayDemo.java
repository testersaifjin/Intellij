package ArrayDemo;

public class Two2DarrayDemo {

    public static void main(String[] args)
    {
        int[][] school = new int[3][3];

        school[0][0] = 11;
        school[0][1] = 12;
        school[0][2] = 13;

        school[1][0] = 14;
        school[1][1] = 15;
        school[1][2] = 16;

        school[2][0] = 17;
        school[2][1] = 18;
        school[2][2] = 19;

        System.out.println(school[1][1]);

        for (int i=0; i<school.length; i++)
        {
            for (int j=0; j<school[i].length;j++)
            {

                System.out.println(school[i][j]);
            }
            System.out.println();
        }

    }
}
