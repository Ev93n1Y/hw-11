/*
 * Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
 *  который "перемешивает" элементы из стримов first и second, останавливается тогда,
 *  когда у одного из стримов закончатся элементы.
 *
 * Dima Aushev
  1 д. назад
Привіт. Як.я це розумію, це простий шафл
12345 -> 42513

якщо точно, поки не залишаться елементи у якомусь зі стрімів, а не у масиві.
умова не дуже зрозуміла, тому її ще можна трактувати ще так
first -> abcd
second -> ABCDEFG
result ->aAbBcCdD (отредактировано)

 * */

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {

    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        return IntStream
                .range(0, Math.min(first.size(), second.size()))
                .mapToObj(i -> first.get(i) + second.get(i))
                .forEach(System.out::println);
    }

}
