class box{
    int height;
    int length;
    int width;


    //constructure use to assign the value in ojective class
    box(int length,int height,int width){
        this.height=height;
        this.length=length;
        this.width=width;
    }

    public void printValue(){
        System.out.println("Good Morning !");
    }

    public void calValue(){
        int value=length*height*width;
        System.out.println("Caluculate value is :"+value);
    }

    //Privious version
    /*public void setvalue(int height,int length,int width){
        this.height=height;
        this.length=length;
        this.width=width;
    }*/
}

public class demo07 {
    public static void main(String args[]){
        box b1 = new box(12,4,7);

        
        //privious version
        //b1.setvalue(12,4,6);

        b1.printValue();
        b1.calValue();

        System.out.println("Length :"+b1.length);
        System.out.println("Height : "+b1.height);
        System.out.println("width :"+b1.width);
    }
}
