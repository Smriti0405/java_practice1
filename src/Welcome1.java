import java.util.Scanner;

public class Welcome1 {

        String name;
        Welcome1(){
            Scanner sc = new Scanner(System.in);
            name = sc.next();
        }

        public void Display() {
            System.out.println("Welcome"+" "+ name);
        }

    public static void main(String[] args) {
        Welcome1 ob = new Welcome1();
        ob.Display();
    }
    }

