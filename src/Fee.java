import java.util.Scanner;

public class Fee {
    int deposit, amt;
    int total;

    String sports;
    Fee(){
        Scanner s = new Scanner(System.in);
        System.out.println("Original fee amount should be greater than Rs 50000: ");
        amt = s.nextInt();
        System.out.println("Enter amount deposited: ");
        deposit = s.nextInt();
        System.out.println("Into sports or not: ");
        sports = s.next();
    }
    public void calculate(){
        total = amt - (amt/ 10);
        if (deposit >= amt/2) {
            total = amt - ((amt *5) / 100);
        }
        if(sports == "yes"){
            total = total + ((amt *5)/100);
        }
        System.out.println("Total amount to be paid is: "+ total);
    }
}
class Result{
    public static void main(String[] args) {
        Fee obj = new Fee();
        obj.calculate();
    }
}
