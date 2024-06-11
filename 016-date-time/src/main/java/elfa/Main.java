package elfa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
//Step 1: Write code to output the current date and time.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//Step 2: Add a timespan of 2 weeks to the current date and output the new date.
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusWeeks(2));

//Step 3: Compare the current date with a specified future date and output whether the current date is before or after the specified date.
        LocalDate futureDate = LocalDate.of(2024, 8, 21);
        System.out.println("localDate.isBefore(futureDate) = " + localDate.isBefore(futureDate));
        System.out.println("localDate.isAfter(futureDate) = " + localDate.isAfter(futureDate));

//Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        long daysBetween = ChronoUnit.DAYS.between(localDate, futureDate);
        System.out.println("daysBetween = " + daysBetween);
    }
}