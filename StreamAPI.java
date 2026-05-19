import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI{
    public static void main(String[] args) {
        List<List<Integer>> numbersList = Arrays.asList(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );
        List<Integer> numbers = numbersList.get(0);

        List<Integer> squaredEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Original numbers: " +numbers);
        System.out.println("Squared even numbers: " +squaredEvens);
    }
}