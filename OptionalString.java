import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class OptionalString{
    public static void main(String[] args) {
        LocalDate currDate = LocalDate.now();
        
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currDate.format(dt);
        
        Optional<String> optionalString = Optional.of("Hello World");

        optionalString.ifPresent(value -> System.out.println("Value is present"));
        System.out.println("LOG DATE: " + formattedDate);
    }
}