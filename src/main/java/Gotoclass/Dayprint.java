package Gotoclass;

import java.time.LocalDate;

public class Dayprint {
    public static void main(String[] args) {
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        LocalDate date = today.minusDays(day - 1);
        int weekday = date.getDayOfWeek().getValue();
        for (int i = 0; i < weekday - 1; ++i)
            System.out.printf("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == day)
                System.out.printf("*");
            else
                System.out.printf(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        System.out.println();
    }
}
