/*  Ajeet Chaurasiya
    section- CSE 11

*/

public class student{
    String name;
    int marks;
    int rollno;
    student(String n,int m,int r)
    {
        name=n;
        marks=m;
        rollno=r;
    }
    void display()
    {
        System.out.println("Name= "+name);
        System.out.println("marks= "+marks);
        System.out.println("roll number= "+rollno);
    }
    public static void main(String[] args) {
        student obj1= new student("Ajeet Chaurasiya",77,106);
        student obj2= new student("Aryan",74,110);
        obj1.display();
        obj2.display();
    }
}
