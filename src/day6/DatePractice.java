package day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePractice {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE MMM dd YYYY");

        String formattedDate = date.format(format);

        System.out.println(formattedDate);
    }

}

