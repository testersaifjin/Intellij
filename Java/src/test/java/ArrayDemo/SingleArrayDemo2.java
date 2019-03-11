package ArrayDemo;

public class SingleArrayDemo2 {

    public static void main(String[] args) {
        int student_id[] = new int[5];

        student_id[0] = 80;

        student_id[1] = 89;

        student_id[2] = 8978;

        student_id[3] = 680;

        student_id[4] = 84;

        int sizeOfArray = student_id.length;
        System.out.println("The Array size is "+sizeOfArray);

        for (int i=0; i<sizeOfArray;i++)
        {
            System.out.println("Student id is "+student_id[i]);
        }



    }
}
