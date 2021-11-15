public class Patient {
    String patientName;
    double height;
    double weight;
    Patient(String p, double h, double w){
        p = patientName;
        h = height;
        w = weight;
    }
    public double BMI(){
        double bmi = weight / (height * height);
        return bmi;
    }

    public static void main(String[] args) {
        Patient obj = new Patient("Rohan", 10, 50);
        System.out.println(obj.BMI());
    }
}
