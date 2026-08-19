//local veriable and locan area and Parameterized method. 
class box{
    int length;
    int height;
    int width;

    //Parameterized method. 
    public void setValue(int a,int b,int c){
        length=a;
        width=b;
        height=c;
    }

    public void printValue(){
        System.out.println("Length: " + length);
        System.out.println("height: " + height);
        System.out.println("width: " + width);
    }
}
public class demo04 {
    public static void main(String args[]){
        box b1 = new box();

        b1.setValue(12,3,7);
        b1.printValue();
    }
}
