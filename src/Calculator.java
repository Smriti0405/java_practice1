public class Calculator{
    public static void main(String[] args) {

        System.out.println(Calculate.powerInt(2, 3));
        System.out.println(Calculate.powerDouble(3.0, 2.0));

    }
}
class Calculate{
    public static int powerInt(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    public static double powerDouble(double num1, double num2){
        return Math.pow(num1, num2);
    }
}
