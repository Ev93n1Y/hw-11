import java.util.stream.Stream;

/*
 * Используя Stream.iterate сделайте бесконечный стрим рандомных чисел,
 * но не используя Math.random. Реализуйте свой "линейный конгруэнтный генератор".
 * Для этого начните с x[0] = seed и затем каждый следующий элемент x[n + 1] = 1 (a x[n] + c) % m,
 * для корректных значений a, c, и m. Необходимо имплементировать метод, который принимает на вход параметры
 * a, c, m и seed и возвращает Stream<Long>. Для теста используйте данные
 * a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
 */
public class Task4 {
    public static void main(String[] args) {
        LinerCongruentGenerator generator = new LinerCongruentGenerator();
        Long seed = 3446L;
        Long a  = 25214903917L;
        int c = 11;
        Long m = (long) Math.pow(2, 48);
        //System.out.println(new LinerCongruentGenerator().generate(a, c, m, seed));
        Stream.iterate(seed, i -> i=generator.generate(a, c, m, i))
                        .forEach(System.out::println);
        //System.out.println(generateValue);
    }

}

class LinerCongruentGenerator {
    public Long generate(Long a, int c, Long m, Long seed) {
        return (a * seed + c)%m;
        //return 1 * (a * seed + c)%m;
    }
}
