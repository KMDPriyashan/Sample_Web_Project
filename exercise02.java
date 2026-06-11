class rectangel{
    double length;
    double width;

    public void recParameter(){
        double para=(2*length)+(2*width);
        System.out.println("Recangle parameter : "+para);
    }

    public void recArea(){
        double area=length*width;
        System.out.println("Recangle area :"+area);
    }

    public void setLength(double length){
        if(length > 0.0 & length < 20.0){
            System.out.println("That is Length value is Floating point number unser the 0.0 to 20.0");
            this.length=length;
        }else{
            System.out.println("That is a Length value is not Floating point number unser the 0.0 to 20.0");
        }
    }

    public void setWidth(double width){
        if(width > 0.0 & width < 20.0){
            System.out.println("Thats is a Width value is Floating point number unser the 0.0 to 20.0");
            this.width=width;
        }else{
            System.out.println("That is a Width value is not Floating point number unser the 0.0 to 20.0");
        }
    }
}

public class exercise02 {
    public static void main(String args[]){
        rectangel r1 = new rectangel();
        r1.setLength(12.5);
        r1.setWidth(14.1);

        r1.recParameter();
        r1.recArea();
        


    }
}
