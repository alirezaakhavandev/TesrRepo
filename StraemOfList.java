import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 9, 6, 17, 11, 12, 1);
        Stream<Integer> numbersStream = numbers.stream().filter(number -> number % 3 == 0);
        numbersStream.forEach(System.out::println);
    }
}
