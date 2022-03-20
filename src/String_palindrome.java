import java.util.Scanner;

public class String_palindrome {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String strs = "";
    char []arr = str.toCharArray();

    public void reverse(){
        for (int i=str.length()-1; i>=0; i--){
            strs += arr[i];
        }
        if (str.equals(strs))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static void main(String[] args) {
        String_palindrome obj = new String_palindrome();
        obj.reverse();
    }
}
