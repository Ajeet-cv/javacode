package in.coding.challenge79;

public class TestEmployee {
    static void main() {
       Employe emp =new Employe("ajeet",20,1);
        System.out.println(emp.getEmployedetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployedetails());
    }
}
