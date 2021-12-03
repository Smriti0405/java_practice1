public class Programming {
    String s;
    Programming(){
        s = "I love Programming.";
    }
    Programming(String abc){
        s = abc;
    }
    public void Show(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Programming obj1 = new Programming();
        obj1.Show();
        Programming obj2 = new Programming("Java is good.");
        obj2.Show();
    }
}
