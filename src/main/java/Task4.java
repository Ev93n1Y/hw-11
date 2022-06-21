import java.util.stream.Stream;

/*Задание 4#
 * Используя Stream.iterate сделайте бесконечный стрим рандомных чисел,
 * но не используя Math.random. Реализуйте свой "линейный конгруэнтный генератор".
 * Для этого начните с x[0] = seed и затем каждый следующий элемент x[n + 1] = 1 (a x[n] + c) % m,
 * для корректных значений a, c, и m. Необходимо имплементировать метод, который принимает на вход параметры
 * a, c, m и seed и возвращает Stream<Long>. Для теста используйте данные
 * a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
 */
public class Task4 {
    public static void main(String[] args) {
        LCGenerator generator = new LCGenerator(3446L, 25214903917L, 11, (long) Math.pow(2, 48));
        generator
                .randomStream()
                .forEach(System.out::println);
    }

}

class LCGenerator {
    Long seed;
    Long a;
    int c;
    Long m;

    public LCGenerator(Long seed, Long a, int c, Long m) {
        this.seed = seed;
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Long generate(Long seed) {
        return (a * seed + c) % m;
    }

    public Stream<Long> randomStream() {
        return Stream.iterate(seed, i -> i = generate(i));
    }
}

