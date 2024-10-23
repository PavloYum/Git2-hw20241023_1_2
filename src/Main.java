import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        List<Integer> numbers = List.of(10, 44, 7, 6, 12, 89);
        int threshold = 33;

        List<Integer> filteredNumbers = Filter.filterGreaterThan(numbers, threshold);
        System.out.printf("Числа больше %d: %s%n", threshold, filteredNumbers);


        List<Integer> filteredIndices = Filter.findIndexesGreaterThan(numbers, threshold);
        System.out.printf("Индексы чисел больше %d: %s%n", threshold, filteredIndices);


        Scanner scanner = new Scanner(System.in);

        // Список товаров
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Яблоко", 1.0));
        products.add(new Product(2, "Банан", 2.0));
        products.add(new Product(3, "Молоко", 1.0));
        products.add(new Product(4, "Хлеб", 3.0));
        products.add(new Product(5, "Мясо", 10.0));

        // Выводим список товаров
        System.out.println("Список доступных товаров:");
        for (Product product : products) {
            System.out.println(product);
        }

        List<Product> cart = new ArrayList<>(); // Корзина для покупок

        // Ввод товаров в корзину
        while (true) {
            System.out.print("Введите номер товара для добавления в корзину (0 для завершения): ");
            int productNumber = scanner.nextInt();

            if (productNumber == 0) {
                break; // Прекращаем ввод товаров, если введен 0
            }

            // Ищем товар по номеру
            Product selectedProduct = null;
            for (Product product : products) {
                if (product.getNumber() == productNumber) {
                    selectedProduct = product;
                    break;
                }
            }

            // Добавляем товар в корзину
            if (selectedProduct != null) {
                cart.add(selectedProduct);
                System.out.println("Товар добавлен: " + selectedProduct.getName());
            } else {
                System.out.println("Товар с таким номером не найден.");
            }
        }

        // Вывод списка покупок
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("\nВаши покупки:");
            double totalCost = 0;
            for (Product product : cart) {
                System.out.println(product);
                totalCost += product.getPrice();
            }
            System.out.println("Итоговая сумма: " + totalCost + "euro");
        }
    }


}
