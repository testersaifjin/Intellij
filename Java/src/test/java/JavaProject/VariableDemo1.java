package JavaProject;

public class VariableDemo1 {

    static int mynumber;

    public static void main(String[] args)
    {
     //This explain local variable and global variable
    //local variable can declare inside any method or main method - that is check the below eg
    //but the global variable can declare by class level - that is check the above e.g. mynumber
    //local variable have to declare and initialize - if you not initialize the local variable by giving any value - it keep throws error
    //but in Global variable we don't have to declare anything - because java assigned default value for global variable
    //local variable contains Garbage values
    //if we dont Initialize anything in the local variable - then Java think this as Garbage value - so there is no point to keep that value
        int a=55;

        System.out.println(a);
        System.out.println(mynumber);

    }

}
