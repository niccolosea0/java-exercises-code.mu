// Task N2: Write a program that will find out how many seconds are in a year.

public class YearInSeconds {
    public static void main(String[] args) {

        int hoursDay = 24;
        int minutesDay = 24 * 60;
        int secondsDay = 60 * minutesDay;
        int secondsYear = secondsDay * 365;

        System.out.println("There is " + secondsYear + " seconds in a year!");
        System.out.println("If year is leap then " + (secondsYear + secondsDay) + " seconds");
         
    }
}


