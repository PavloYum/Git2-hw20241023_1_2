import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > threshold) {
                result.add(number);
            }
        }

        return result;  // Возвращаем список
    }

    // Метод, который возвращает индексы чисел, больше заданного значения
    public static List<Integer> findIndexesGreaterThan(List<Integer> numbers, int threshold) {
        List<Integer> indices = new ArrayList<>();

        // Проходим по каждому числу и проверяем, больше ли оно порога
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > threshold) {
                indices.add(i);  // Если больше, добавляем индекс в список
            }
        }

        return indices;  // Возвращаем список индексов
    }

}
