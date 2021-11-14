import java.util.Scanner;

public class Digit {
    int num1;
    Digit(){
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
    }
    public int Tens(){
        num1 = num1/10;
        int num2 = num1 % 10;
        return num2;
    }

    public static void main(String[] args) {
        Digit ob = new Digit();
        System.out.println(ob.Tens());
    }
}
