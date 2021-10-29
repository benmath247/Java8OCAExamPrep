package practice.q18;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
//Which of the following print a date representing April 1, 2015?
public class Q18 {
    public static void main(String[] args){
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));  //java.util.Calendar is old and
                                                                                    //starts months at 0 so april is 3
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));       //not April
        System.out.println(LocalDate.of(2015, 4, 1));
        //System.out.println(new LocalDate(2015, 3, 1)); //Wrong format
        //System.out.println(new LocalDate(2015, 4, 1));    //Wrong format

    }
}
