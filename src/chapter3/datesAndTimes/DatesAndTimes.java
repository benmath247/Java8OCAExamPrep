package chapter3.datesAndTimes;

import java.time.*;

public class DatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        System.out.println();
        System.out.println();

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20); //takes Month enum
        LocalDate date2 = LocalDate.of(2020, 1, 20); //takes an int
        System.out.println(date1.equals(date2)); //just curious...true! == is false

        //LocalDate test = new LocalDate();     //does not compile
        try {
            LocalDate test2 = LocalDate.of(2020, 1, 32); //compiles but runtime datetime exception
        } catch (DateTimeException dte){
            System.out.println("This is a date time exception");
        }

        //Converting to a long value
        System.out.println(date.toEpochDay()); //does not change date, prints days since 1970
        LocalTime time = LocalTime.of(13,23,23,450);
        //System.out.print(time.toEpochTime());     doesnt exist
        //System.out.println(dt.toEpochSecond()); doesnt seem to work even though book says it does


    }
}
