package ArrayDemo;

public class SingleArray {

    public static void main(String[] args)
    {
        //Array is a collection of similar data type

        //Array of integer
        //Array of String
        //Array of char
        //Array of double and so on

        //Array Syntax
        //datatype arrayname[] = new datatype[size];

        //int arr[] = new int[5]
        //arr[0] = 10;
        //arr[1] = 20;
        //arr[2] = 30;

        int student_id[] = new int[5];

        student_id[0]=80;

        student_id[1]=89;

        student_id[2]=8978;

        student_id[3]=680;

        student_id[4]=84;

        //limitation of array - Retrieving time we should know the size of the array to avoid Exception
        //limitation of type - Only same type of data allowed in a singleArray

        System.out.println("The Student id is "+student_id[3]);


    }
}
