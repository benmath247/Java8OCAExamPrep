package chapter3.datesAndTimes; ///come back to this

import java.time.LocalDate;
import java.time.Period;

public class Periods { //periods cannot chain methods
    static Period a = Period.ofMonths(1);
    static Period b = Period.of(10, 2, 1);

    public static void main(String[] args){
        LocalDate date = LocalDate.of(2015, 1, 1);
        LocalDate newDate = date.plus(a);
        System.out.print(newDate);

    }
}
