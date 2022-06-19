import java.util.ArrayList;
import java.util.StringJoiner;

/*
Задание 1#
Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).
 */

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Taras");
        namesList.add("Andriy");
        namesList.add("Oleh");
        namesList.add("Yevhen");
        namesList.add("Svitlana");
        namesList.add("Yuliya");
        namesList.add("Olena");
        Task1.printOddNames(namesList);
    }

    public static void printOddNames(ArrayList<String> list) {
        StringJoiner joiner = new StringJoiner(", ");
        int i = 0;
        String oddElement;
        for (String s : list) {
            oddElement = s;
            if (i % 2 != 0) {
                joiner.add(i + "." + oddElement);
            }
            i++;
        }
        System.out.println(joiner);
    }
}