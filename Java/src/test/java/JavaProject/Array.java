package JavaProject;

import org.apache.xerces.xni.grammars.XMLGrammarDescription;

public class Array {


    /**
    * Arryas contain a fixed number of variables
    * they are reference by name and index
    * Index -->      0       1       2        3
    *              +---------+-----+-------+-----
    * Grades        |77 |   84    |  80    | 96  |
    *              +---------+-----+-------+--
    * Students      |Tom   | Ed |    Joe   | Bob    |
    *
    */

    public static void main(String[] args)
    {
        int[] grades = new int[4]/*{88, 98, 66, 77}*/;

                grades[0] = 5;
                grades[1] = 5;
                grades[2] = 5;
                grades[3] = 5;

                String[] students = new String[] {"tom", "bob", "joe", "ed"};

                double sum = 0.0;

        System.out.printf("#\tStudent\tGrades\n");
        System.out.printf("-\t--------\t------\n");

        for (int i=0; i<students.length; i++){
            System.out.printf("%d\t%s\t        %d\n", i, students[i],grades[i]);
            sum += grades[i];
        }

        double average = sum / grades.length;
        System.out.printf("Class Average %f\n", average);
    }
}
