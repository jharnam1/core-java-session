package day6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class DatePractice {


    public static void main(String[] args) {

        //Assignment 7
        LocalDate date = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE MMM dd YYYY");

        String formattedDate = date.format(format);

        System.out.println(formattedDate);


        //Assignment 8

        LocalDate dob = LocalDate.of(1997, 01, 05);

        LocalDate curLocalDate = LocalDate.now();

        Period age = Period.between(dob, curLocalDate);

        System.out.println("You are " + age.getYears()+" years old");




//Practice
        // Current Date
        Date currentDate = new Date();
        System.out.println(currentDate);

        int year = 2023 - 1900; //2023;
        int month = Calendar.APRIL;
        int day = 23;

        // Don't Use
        Date specificDate = new Date(year, month, day);
        System.out.println(specificDate);

        Date miliSecondCurrentDate = new Date(1683076621023L);
        System.out.println(miliSecondCurrentDate);

        System.out.println(ZoneId.systemDefault());


//        LocalDate , LocalDateTime
        LocalDate currentLocalDate = LocalDate.now(ZoneId.of("Asia/Kathmandu"));

        System.out.println(currentLocalDate);


        LocalDate specificLocaleDate = LocalDate.of(2023, Month.FEBRUARY, 3);
//        LocalDate addedDate = specificLocaleDate.plusDays(90);
//        System.out.println(addedDate);

//        System.out.println(addedDate.getMonth());
//
//        System.out.println(currentLocalDate.isBefore(addedDate));

        System.out.println(specificLocaleDate.lengthOfMonth());


//        2023-05-03 => Wed May 3 2023 // Date Formatting

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println(currentDateAndTime);

        String birthDate = "1993/01/05";

        // Convert String birthdate to date class

        // JodaTime -> Library

        Calendar currentCalendar = Calendar.getInstance();
        System.out.println(currentCalendar);

        Date currentCalendarDate = currentCalendar.getTime();
        System.out.println(currentCalendarDate);

        Calendar someSpecificCalendar = Calendar.getInstance();
        someSpecificCalendar.set(2023, Calendar.APRIL, 23);

        System.out.println(someSpecificCalendar);



    }
}




