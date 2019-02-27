package JavaProject;

public class SwitchDemo {

    public static void main(String[] args)
    {

        int x=5;

        switch (x)
        {
            case 1:
                System.out.println("Poor");
                break;
                //break is optional
            //default is optional
            //but break should give as a part of the best practice
            //for e.g. in the below code - if we don't give break statement - then it will print the x value also the default value
            //printing both x and default value is not the correct answer

            case 2:
                System.out.println("Slow");
                break;

            case 3:
                System.out.println("Average");
                break;

            case 4:
                System.out.println("Good");
                break;

            case 5:
                System.out.println("Well Done");
                break;

                default:
                    System.out.println("Fired");
        }

    }
}
