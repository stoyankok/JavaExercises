package main;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;

public class DaysOfWeek {

    public static void getDayOfWeek() {
        Calendar currentDay = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter for how many days you want to check: ");
        int howManyDaysAhead = scanner.nextInt();

        currentDay.add(Calendar.DAY_OF_WEEK, howManyDaysAhead);
        int futureDay = currentDay.get(Calendar.DAY_OF_WEEK);

        System.out.println("After " + howManyDaysAhead + " days it will be " + DayOfWeek.of(futureDay));
    }

    public static void main(String[] args) {
        getDayOfWeek();
    }

}

