//Q23 --> //That programe has a error because objective class variable is private. then we can't access the main mathod in another main class. 
class box{
    private int height;
    private int width;
    private int length;

    public void printValues(){
        System.out.println("Hellow Object Function Calling !");
    }

    public void setValues(int width,int height,int length){
        this.length=length;
        this.height=height;
        this.width=width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

}
public class demo06 {
    public static void main(String args[]){
        box b1 = new box();

        b1.printValues();
        b1.setValues(12,4,7);

        System.out.println("Length :"+b1.getLength());
        System.out.println("height :"+b1.getHeight());
        System.out.println("width :"+b1.getWidth());
    }
}
