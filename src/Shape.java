public class Shape {
    public void Erase(){
        System.out.println("Erasing Shape.");
    }
    public void Draw(){
        System.out.println("Drawing Shape.");
    }

    public static void main(String[] args) {
        Shape ob1 = new Shape();
        Shape ob2 = new Shape();
        ob1.Draw();
        ob2.Erase();
    }
}
