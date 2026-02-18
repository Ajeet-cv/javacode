/*   Write a Java program to create a Student class, initialize student details using a parameterized constructor, and display the student information using class objects and member functions.
 */
class studentclass {
    int id;
    String name;

    studentclass(int i, String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        studentclass s1 = new studentclass(101, "Ajeet");
        studentclass s2 = new studentclass(102, "Rahul");

        s1.display();
        s2.display();
    }
}
/*           OUTPUT
ID: 101
Name: Ajeet
ID: 102
Name: Rahul
PS C:\Users\Ajeet Chaurasiya\OneDrive\Desktop\javacode\college labs experiment\exp1>
 */
