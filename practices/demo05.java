
//This command use that. If you call the any object class variable or function must be use the " b1.-variable or function_name-" but you not want to add this "b1.- -" in to the object class functions or methods. 
class box{
    int height;
    int width;
    int length;

    public void setValue(int length,int width,int heigth){
        this.length=length;
        this.width=width;
        this.height=heigth;
    }

    public void printValue(){
        System.out.println("Length :"+length);
        System.out.println("Width :"+width);
        System.out.println("Height :"+height);
    }
}

public class demo05 {
    public static void main(String args[]){
        box b1 = new box();

        b1.setValue(12,5,7);
        b1.printValue();

        System.out.println("Again height :"+b1.height);
        System.out.println("Again width :"+b1.width);
        System.out.println("Again length :"+b1.length);
    }
}
