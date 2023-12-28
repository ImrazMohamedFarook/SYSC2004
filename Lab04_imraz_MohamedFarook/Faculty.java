public class  Faculty extends Person {
    private boolean contractType;
    private String departmentName;

    @Override
    public void userInput() {

    }

    public void printInfo(){
        System.out.println("Welcome to SYSC2004 Lab 04\n" +
                "Apparently you are a faculty!");
        System.out.println("Faculty name is: " + firstName + lastname);
        System.out.println("Faculty is " + 0 + " years old " );
        System.out.println("Faculty is in " + departmentName );
        if (contractType){
            System.out.println("Faculty is a full time");
        }else{
            System.out.println("Faculty is a part time");
        }

    }
    public Faculty(String firstName, String lastName, String departmentName, Boolean contractType){
        super();
        this.firstName = firstName;
        this.lastname =lastName;
        this.departmentName = departmentName;
        this.contractType = contractType;

    }
    public Faculty(){
        super();
        firstName ="FacultyFirst ";
        lastname = "FacultyLast";
        departmentName = "DefaultDepartment";
        personType = false;
        contractType = true;


    }


}
