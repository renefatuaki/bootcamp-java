package elfa;

//Step 1: Filter a list of numbers and only output the even numbers.
//Step 2: Use 'map' and double each number in the list.
//Step 3: Sort the list in ascending order.
//Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
//Step 5: Use 'forEach' and output each processed number.
//Step 6: Collect the processed numbers into a new list using 'collect'.

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> numberList = Stream.of(1, 2, 3, 4, 8, 7, 6, 5).toList();
        List<Integer> evenNumbers = numberList.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> sortedNumbers = evenNumbers.stream()
                .sorted()
                .toList();

        System.out.println("sortedNumbers = " + sortedNumbers);

        int sumOfNumbers = sortedNumbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("sumOfNumbers = " + sumOfNumbers);

        numberList.forEach(System.out::println);

        List<Integer> processedNumbers = sortedNumbers.stream().collect(Collectors.toList());
        System.out.println("processedNumbers = " + processedNumbers);

        System.out.println("""
                ----------------------------------
                BONUS
                ----------------------------------
                """);

        try (Stream<String> lines = Files.lines(Path.of("students.csv"))) {
            Stream<String> reducedLines = lines.skip(1);
            reducedLines.forEach(System.out::println);
        } catch (IOException error) {
            // Handle the exception
        }
    }
}