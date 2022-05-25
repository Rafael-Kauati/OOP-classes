package Ex9_1.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Date {
    public int day,month,year;

    //Contructor
    public Date(int day, int month, int year){
        setDate(day,month,year);
    }

    //Getters and Setters
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }

    public int getYear() {return year;}

    //Main Methods
    public static boolean isLeapYear(int year){
        boolean isLeaYear = false;
        if(year%4==0){
            if(year%100!=0){
                isLeaYear =  true;
            }
        }
        else{
            if(year%400==0){
                isLeaYear = true;
            }
        }
        return isLeaYear;

    }
    public boolean IsvalidMonth(int month){
        return month >= 1 && month <= 12;
    }

    public  int getDaysOfMonth(int month){
        Map<Integer,Integer> daysOfMonth = new HashMap<>();

        daysOfMonth.put(1, 31);
        //In case of the year is leapyear
        if(isLeapYear(this.year)){daysOfMonth.put(2, 28);}

        else daysOfMonth.put(2, 29);

        daysOfMonth.put(3, 31);
        daysOfMonth.put(4, 30);
        daysOfMonth.put(5, 31);
        daysOfMonth.put(6, 30);
        daysOfMonth.put(7, 31);
        daysOfMonth.put(8, 31);
        daysOfMonth.put(9, 30);
        daysOfMonth.put(10, 31);
        daysOfMonth.put(11, 30);
        daysOfMonth.put(12, 31);

        return daysOfMonth.get(month);
    }

    public static boolean isValidData(int day, int month, int year){
        boolean valid = year >= 0;
        //IntStream daysRange = IntStream.range(1, daysOfMonth.get(month));

        if(month < 1 || month > 12){
            valid = false;
        }
        else{
            Map<Integer,Integer> daysOfMonth = new HashMap<>();

            daysOfMonth.put(1, 31);
            //In case of the year is leapyear
            if(isLeapYear(year)){daysOfMonth.put(2, 28);}

            else daysOfMonth.put(2, 29);

            daysOfMonth.put(3, 31);
            daysOfMonth.put(4, 30);
            daysOfMonth.put(5, 31);
            daysOfMonth.put(6, 30);
            daysOfMonth.put(7, 31);
            daysOfMonth.put(8, 31);
            daysOfMonth.put(9, 30);
            daysOfMonth.put(10, 31);
            daysOfMonth.put(11, 30);
            daysOfMonth.put(12, 31);
            final int days = daysOfMonth.get(month);
            if(day < 1 || day > days){
                valid = false;
            }
        }

        return valid;
    }

    public void increment(){
        boolean isValid = isValidData(this.day, this.month, this.year);
        if(!isValid){
            System.out.printf("\nThe %s/%s/%s date is invalid ;\nPlease set and valid data",this.day,this.month,this.year);
        }
        else{

            if(day == getDaysOfMonth(this.month)){
                if(month == 12){
                    //setDate(1,1,this.year++);
                    this.day =1;
                    this.month = 1;
                    this.year ++;
                }
                else if(month < 12){
                    //setDate(1,this.month++,this.year);
                    this.day =1;
                    this.month++;

                }
            }

            else if(day < getDaysOfMonth(this.month)){
                //setDate(this.day++, this.month, this.year);
                this.day++;
            }
        }

    }

    public void decrement(){
        boolean isValid = isValidData(this.day, this.month, this.year);
        if(!isValid){
            System.out.printf("\nThe %s/%s/%s date is invalid ;\nPlease set and valid data",this.day,this.month,this.year);
        }
        else{
            boolean isLeaYear = isLeapYear(this.year);
            Map<Integer,Integer> daysOfMonth = new HashMap<>();

            daysOfMonth.put(1, 31);
            //In case of the year is leapyear
            if(isLeapYear(year)){daysOfMonth.put(2, 28);}

            else daysOfMonth.put(2, 29);

            daysOfMonth.put(3, 31);
            daysOfMonth.put(4, 30);
            daysOfMonth.put(5, 31);
            daysOfMonth.put(6, 30);
            daysOfMonth.put(7, 31);
            daysOfMonth.put(8, 31);
            daysOfMonth.put(9, 30);
            daysOfMonth.put(10, 31);
            daysOfMonth.put(11, 30);
            daysOfMonth.put(12, 31);

            if(day == 1){
                if(month  == 1){
                    day = 31;
                    month = 12;
                    year-=1;
                }
                else if(month  > 1){
                    day = daysOfMonth.get(month - 1);
                    month -= 1;
                }
            }
            else if(day > 1){
                day -=1;
            }


        }

    }
    public String formatData(){return Integer.toString(getYear()) + "-"+Integer.toString(getMonth())+"-"+Integer.toString(getDay());}
}