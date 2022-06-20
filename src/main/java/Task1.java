import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
Задание 1#
Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).
 */

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Taras", "Andriy", "Oleh", "Yevhen", "Svitlana", "Yuliya", "Olena"));
        System.out.println(returnOddNames(namesList));

    }

    public static String returnOddNames(ArrayList<String> list) {
        return list.stream()
                .filter(s -> list.indexOf(s) % 2 != 0)
                .map(s -> list.indexOf(s) + ". " + s)
                .collect(Collectors.joining(", "));
    }
}