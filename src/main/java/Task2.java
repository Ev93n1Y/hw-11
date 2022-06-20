import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Задание 2#
 *
 * Метод принимает на вход список из строк (можно список из Задания 1).
 * Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
 */

public class Task2 {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(Arrays.asList("Taras", "Andriy", "Oleh", "Yevhen", "Svitlana", "Yuliya", "Olena"));
        System.out.println(descendSortToUpperCase(namesList));

    }

    public static List<String> descendSortToUpperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .toList();
    }
}
