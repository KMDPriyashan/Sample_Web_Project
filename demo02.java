
//This is the value assign for objective class variables in to main class. and must becreate the variable in to the objective class and call the objective class function. naither come to sysntax error. 

class student{
    String name;
    int age;
    String address;

    public void printList(){
        System.out.println("Thank you your watching..!");
    }

    public void setValue(){

    }
}

public class demo02 {
    public static void main(String args[]){
        student s1 = new student();

        s1.name="Dulash";
        s1.age=22;
        s1.address="Gampaha";

        System.out.println("User name :"+s1.name);
        System.out.println("User age :"+s1.age);
        System.out.println("User address :"+s1.address);

        s1.printList();
        s1.setValue();
    }
    
}
