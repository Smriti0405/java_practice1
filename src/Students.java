import java.util.Scanner;

public class Students {
    String name1;
    int percentage1;
    String name2;
    int percentage;

    Students() {
        Scanner s = new Scanner(System.in);
        name1 = "ss";
        name2 = "sss";
    }
}
    class Test1 extends Students{
        int eng1;
        int maths1;
        int science1;
        int eng2;
        int maths2;
        int science2;

        Test1(int e, int m, int sc, int ee, int mm, int scc) {
            e = eng1;
            m = maths1;
            sc = science1;
            ee = eng2;
            mm = maths2;
            scc = science2;
        }

        public void Larger() {
            int per1 = (eng1 + maths1 + science1) / 3;
            int per2 = (eng2 + maths2 + science2) / 3;
            if (per1 > per2)
                System.out.println(name1 + " "+per1);
            else
                System.out.println(name2+" "+per2);
        }
    }
class Output {
    public static void main(String[] args) {
        Students obj = new Students();
        Test1 obj1 = new Test1(32, 45, 43, 33, 46, 23);
        obj1.Larger();
    }

}
