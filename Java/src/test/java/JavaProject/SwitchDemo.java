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
