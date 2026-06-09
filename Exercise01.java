
//Q26 ->Answer
class date{
    int year;
    int month;
    int day;

    public void setDate(int year,int month,int day){
        this.year=year;
        this.month=month;
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

public class Exercise01 {
    public static void main(String args[]){
        date d1 = new date();

        d1.setDate(2025,9,14);
        System.out.println("Day is : "+d1.getYear()+"-"+d1.getMonth()+"-"+d1.getDay()); //2024-09-14
    }
}
