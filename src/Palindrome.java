public class Palindrome {
    int num, rem, temp=0;
    Palindrome(int n){
        num = n;
    }
    public void reverse(){
        while(num > 0){
            rem = num % 10;
            temp = temp * 10 + rem;
            num = num / 10;
        }
            if(temp == num)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Palindrome ob = new Palindrome(1000);
        ob.reverse();
    }
}
