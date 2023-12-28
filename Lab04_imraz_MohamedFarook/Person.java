public abstract class Person {
    protected boolean personType;

    protected int age;
    protected String lastname,firstName;
    public abstract void userInput();
    public void printInfo(){
        System.out.println("Welcome to SYSC2004 Lab 04\n" +
                "Apparently you are a person!");
        System.out.println( "Your name is: " + firstName + lastname);
        System.out.println("you are " + age + " years old");
        if(personType) {
            System.out.println("You are a Faculty");
        }else{
            System.out.println("You are a Student");
        }

    }
    public Person(){
        firstName = "DefaultFirst ";
        lastname = "DefaultLast";
        age = 0;
        personType = true;


    }

}
