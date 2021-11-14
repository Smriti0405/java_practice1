import java.util.Scanner;

public class Employee {
    int sal;
    int hrs;
    public void getInfo(){
        Scanner s = new Scanner(System.in);
        sal = s.nextInt();
        hrs = s.nextInt();
    }
    public void AddSal() {
        if(sal < 500) {
            int a = sal+10;
            System.out.println(a);
        }
        else{
            System.out.println(sal);
        }
    }
    public void AddWork(){
        if(hrs >6) {
            int a = sal+5;
            System.out.println(a);
        }
        else
            System.out.println(sal);
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.getInfo();
        Employee obj2 = new Employee();
        obj2.AddSal();
        Employee obj3 = new Employee();
        obj3.AddWork();
    }
    }
