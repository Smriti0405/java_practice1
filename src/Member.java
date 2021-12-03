public class Member {
    String name, address;
    int age, phone, salary;
    Member(String n, String add, int age, int ph, int sal){
        name = n;
        address = add;
        phone = ph;
        salary = sal;
        this.age = age;

    }
    public void printSalary(){
        System.out.println("Name: "+ name+" "+"Age: "+" "+age+" "+"Salary: "+ salary);
        System.out.println("Phone number: "+ phone+" "+"Address: "+address);
    }
}
class Employee1 extends Member{
    String specialization;
    Employee1(String spcl, String n, String add, int ph, int sal, int age){
        super(n, add, age, ph, sal);
        specialization =spcl;
    }
    public void printSalary(){
       super.printSalary();
        System.out.println("Specialization: "+ specialization);
    }
}
class Manager extends Member{
    String dept;
    Manager(String dept, String n, String add, int ph, int sal, int age){
        super(n, add, ph, sal, age);
        this.dept = dept;
    }
    public void printSalary(){
        super.printSalary();
        System.out.println("Department: "+ dept);
    }
}
class Show{
    public static void main(String[] args) {
        Employee1 obj2 = new Employee1("AI", "aa", "nepal", 6438329, 90999, 32);
        Manager obj3 = new Manager("CS", "bbb", "bhopal", 893753023, 100000, 45);
        obj2.printSalary();
        obj3.printSalary();
    }
}
