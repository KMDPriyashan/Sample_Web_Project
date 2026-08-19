//this is the fitst programe for java class object and call the object class function in to the main class

class student{
    public void printList(){
        System.out.println("Hello World");
    }
}

public class demo {
    public static void main(String args[]){
        student s1 = new student();
        s1.printList();
    }
    
}
