public class Rectangle {
    int height;
    int width;
    Rectangle(int h, int w){
        height = h;
        width = w;
    }
    public int Area(){
        int area = height * width;
        return area;
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(3,2);
        System.out.println(obj.Area());
    }
}
