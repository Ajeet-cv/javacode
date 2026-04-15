package in.coding.challenge79;

public class Employe {
    private String name;
    private int age;
    private double sallary;

    public Employe(String name, int age, double sallary) {
        this.name = name;
        this.age = age;
        this.sallary = sallary;
    }
     String getEmployedetails(){
        return "Employedetalais: Name:"+ name +
                ", Age: "+ age + ", Sallary: "+sallary;
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
}
