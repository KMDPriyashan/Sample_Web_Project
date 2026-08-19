class employee{
    String fname;
    String lname;
    double salary;

    employee(String fname, String lname , double salary){
        this.fname=fname;
        this.lname=lname;
        if (salary > 0.0){
            this.salary=salary;
        }
        
        
    }

    public double getYearSalary(){
        return salary * 12.0;
    }

    public void giveRaise(double percent){
        salary += salary * (percent / 100);
        System.out.println("New Salary : "+salary);
    }
}

public class EmployeeTest {
    public static void main (String args[]){
        employee ep1 = new employee("Dulash","Priyashan",45000.00);
        ep1.giveRaise(10.0);
        System.out.println("Yearly salary :"+ep1.getYearSalary());

    }
}
