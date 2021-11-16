public class AddAmount {
    int amount =50;
    AddAmount(){

    }
    AddAmount(int a){
        amount= a+ amount;
    }
    public void Display1(){
        System.out.println(amount);
    }

    public static void main(String[] args) {
        AddAmount obj = new AddAmount(32);
        obj.Display1();
        AddAmount obj1 = new AddAmount();
        obj1.Display1();
    }
}
