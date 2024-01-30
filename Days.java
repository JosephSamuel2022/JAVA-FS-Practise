package DateDiff;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Days {
    public static int daysBetweenDates(String date1, String date2) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate d1 = LocalDate.parse(date1, formatter);
            LocalDate d2 = LocalDate.parse(date2, formatter);
            if (d1.isAfter(d2)) {
                LocalDate temp = d1;
                d1 = d2;
                d2 = temp;
            }
            int days = 0;
            while (!d1.isEqual(d2)) {
                d1 = d1.plusDays(1);
                days++;
            }
            return days;
        } catch (Exception e) {
            return -1; // indicate invalid input
        }
    }

    public static void main(String[] args) {
        System.out.println(daysBetweenDates("01-01-2021", "31-12-2021"));
        System.out.println(daysBetweenDates("31-12-2021", "01-01-2021"));
        if(daysBetweenDates("32-02-2021", "01-03-2021")==-1)
            System.out.println("Not a valid date ");
    }
}