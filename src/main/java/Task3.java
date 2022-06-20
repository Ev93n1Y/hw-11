import java.util.stream.Collectors;
import java.util.stream.Stream;
/*Задание 3#
 * Дан массив:
 *     ["1, 2, 0", "4, 5"]
 * Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
 *     "0, 1, 2, 4, 5"
 */

public class Task3 {
    public static void main(String[] args) {
        String[] string = {"1, 2, 0", "4, 5"};
        System.out.println(digitConcat(string));
    }

    public static String digitConcat(String[] strings) {
        return Stream.of(String.join(", ", strings).split(", "))
                .sorted()
                .collect(Collectors.joining(", "));
    }

}
