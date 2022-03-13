package lesson19.homework;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimePrint {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(LocalTime.now().format(formatter));
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter1));

    }
}
