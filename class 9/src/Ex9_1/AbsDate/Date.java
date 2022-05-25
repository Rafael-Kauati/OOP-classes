package Ex9_1.AbsDate;

public abstract class Date {
    public abstract Boolean validMonth(int m);
    public abstract int monthDays(int m, int a);
    public abstract Boolean leapYear(int a);
    public abstract Boolean validDate(int d, int m, int a);
    public abstract String printt();
    public abstract void incrementDate();
    public abstract void decrementDate();
    public abstract int decrementDatee(int dia, int mes, int ano);
    public abstract int getDate();
}
