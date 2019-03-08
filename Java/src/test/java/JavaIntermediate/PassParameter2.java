package JavaIntermediate;

public class PassParameter2 {

    public static void main(String[] args)
    {

        DynamicCalculator obj1 = new DynamicCalculator();

        int sum = obj1.add(45, 68);

        System.out.println(sum);

        double sub = obj1.sub(6855.054, 45.458);
        System.out.println(sub);

        String printname = DynamicCalculator.getMyName("Saif", "Deen");
        System.out.println(printname);

    }
//In this we going to change the return type
//Previous class we use Void (means not return anything)
//In this we remove Void - because this method is going to return some value
//I have to remove this method and created separate class as Dynamic Calculator

//    public int add(int a, int b)
//    {
//        int c= a + b;
//
//        return c;
//
//    }
//    public double sub(double x, double y)
//    {
//
//        double z=x-7;
//
//        return z;
//
//    }
}
