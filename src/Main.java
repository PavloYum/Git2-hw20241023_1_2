import java.util.List;

public class Main {


    public static void main(String[] args) {



        List<Integer> numbers = List.of(10, 44, 7, 6, 12, 89);
        int threshold = 33;


        List<Integer> filteredNumbers = Filter.filterGreaterThan(numbers, threshold);
        System.out.printf("Числа больше %d: %s%n", threshold, filteredNumbers);


        List<Integer> filteredIndices = Filter.findIndexesGreaterThan(numbers, threshold);
        System.out.printf("Индексы чисел больше %d: %s%n", threshold, filteredIndices);
    }
}
