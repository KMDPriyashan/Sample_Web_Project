
class Date{
    private int year;
    private int month;
    private int day;

    public void printDate(){
        System.out.println("Day is :"+year+"-"+month+"-"+day);
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public void setDay(int day){
        this.day=day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }
}

class Demo08 {
    public static void main(String args[]){
        Date d1=new Date();
        d1.printDate(); //1970-1-1
        //d1.year=2016; //illegel
        //d1.month=5; //illegel
        //d1.day=30; //illegal
        //year, month and day attributes cannot be accessed to another class
        d1.setYear(2016);
        d1.setMonth(5);
        d1.setDay(31);

        d1.printDate(); //1970-1-1
        System.out.println("Year: "+d1.getYear());
        System.out.println("Month :"+d1.getMonth());
        System.out.println("Day: "+d1.getDay());
    }
}