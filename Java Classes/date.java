import java.time.*;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted_date_time = datetime.format(formatter);
        System.out.println(formatted_date_time);
    }
}

// LocalDate
// LocalTime
// LocalDateTime
// DateTimeFormatter