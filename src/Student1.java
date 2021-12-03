public class Student1 {
    String name;
    int age;
    String address;
    Student1(){
        name = "unknown";
        age = 0;
        address = "not available";
    }

    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + " "+ age);
    }
    public void setInfo(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println(name + " " + age +" " + address);
    }
    public String toString(){
        return(name + age + address);
    }

    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.setInfo("ss", 32);
        obj.setInfo("aa", 23, "mmm");
    }
}
