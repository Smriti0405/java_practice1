import java.util.Objects;
import java.util.Scanner;

public class Student {
       class Name {
        String stu1;

        Name(String hjg) {
            stu1 = hjg;
            Scanner s = new Scanner(System.in);
            String stu1 = s.next();
            if(stu1.equals("None")){
                System.out.println("Unknown");
            }
            else{
                System.out.println(stu1);
            }
            }
        }
        Student(){
           Name ob=new Name("'sjgyfsh'");
        }
        public static void main(String[] args) {
            Student obj1 = new Student(); //pass the parameter here''
    }
}
