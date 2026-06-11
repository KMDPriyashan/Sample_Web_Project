
class cylinder{
    private double redious;
    private double length;

    cylinder(){ 

    }

    cylinder(double redious , double length){
        this.length=length;
        this.redious=redious;

    }

    public void calVolumn(){
        double volumn = Math.PI * redious * redious * length;
        System.out.println("Volumn is :"+volumn);
    }

    public void calarea(){
        double area = (2 * Math.PI * redious * length) + (2 * Math.PI * redious * redious);
        System.out.println("Area is :"+area);
    }

    public double Getradious(){
        return redious;
    }

    public double Getlength(){
        return length;
    }

}

public class Exercise03 {
    public static void main(String args[]){
        cylinder c1 = new cylinder(); //default constructor call
        cylinder c2 = new cylinder(12.5,10.8); //parameterize constructure calling
        c1.calVolumn();
        c1. calarea();
        c2.calVolumn();
        c2. calarea();

        System.out.println("Radious :"+c2.Getradious());
        System.out.println("Length :"+c2.Getlength());

    }
}
