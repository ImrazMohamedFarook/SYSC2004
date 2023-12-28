import javax.naming.Name;
import java.util.Scanner;

public class Student extends Person{
    private Boolean regType,studentType;
    private double GPA;
    private String departmentName;

    public void userInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = in.next();
        System.out.print("Enter your last name: ");
        lastname = in.next();
        System.out.print("Enter your age: ");
        age = in.nextInt();
        System.out.print("Enter true for Faculty or false for Student: ");
        personType = in.nextBoolean();
        System.out.print("Enter your Department name: ");
        in.nextLine();
        departmentName = in.nextLine();
        System.out.print("Enter your GPA: ");
        GPA = in.nextDouble();
        System.out.print("Enter true for Undergraduate or false for graduate student: ");
        studentType = in.nextBoolean();
        System.out.print("Enter true for FULL TIME or false for PART TIME student: ");
        regType = in.nextBoolean();

    }
    public void printInfo(){
        System.out.println("Welcome to SYSC2004 Lab 04");
        if(!personType) {
            System.out.println("Apparently you are a student!");
        }else{
            System.out.println("Apparently you are a faculty!");
        }
        System.out.println("Student name is : " + firstName + lastname);
        System.out.println("student is " + age + " years old");
        System.out.println("student is in " + departmentName + "and their GPA is : " + GPA);
        if (studentType){
            if (regType){
                System.out.println("student is a full time undergraduate student");
            }else{
                System.out.println("Student is a part time undergraduate student");
            }
        }else {
            if (regType) {
                System.out.println("student is a full time Graduate student");
            }else{
                System.out.println("Student is a part time Graduate student");
            }
        }

    }
    public Student(String firstName, String lastName, String departmentName, double GPA, Boolean studentType, Boolean regType){
        super();
        this.firstName = firstName;
        this.lastname = lastName;
        this.departmentName = departmentName;
        this.GPA =GPA;
        this.studentType = studentType;
        this.regType = regType;
    }
    public Student(){
        super();
        firstName = "StudentFirst ";
        lastname = "StudentLast";
        departmentName =  "DefaultDep ";
        GPA = 4;
        personType = true;
        studentType = true;
        regType = true;





    }

}
