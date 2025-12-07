package date_and_times;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        System.out.println(date + "\n");

        LocalTime time = LocalTime.now();
        System.out.println(time + "\n");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime + "\n");

        // UTC timestamp
        Instant instant = Instant.now();
        System.out.println(instant + "\n");

        // Custom format
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime2.format(formatter);
        System.out.println(newDateTime);

        LocalDate date2 = LocalDate.of(2025, 12, 25);
        System.out.println(date2);

        LocalDateTime dateTime3 = LocalDateTime.of(2024,12,25,12,0);
        System.out.println(dateTime3);
    }
}
