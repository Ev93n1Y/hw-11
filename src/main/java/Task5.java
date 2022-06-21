/*Задание 5#
 * Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
 *  который "перемешивает" элементы из стримов first и second, останавливается тогда,
 *  когда у одного из стримов закончатся элементы.
 * */

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> streamLower = Stream.of("a", "b", "c", "d", "e", "f");
        Stream<String> streamUpper = Stream.of("A", "B", "C", "D", "E", "F", "G", "H");

        Stream<String> zippedStream = StreamSupport
                .stream(new ZipIterator<>(streamLower, streamUpper).spliterator(), false);
        zippedStream.forEach(System.out::print);
    }


    static class ZipIterator<T> implements Iterator<T>, Iterable<T> {
        Iterator<T> iterator1;
        Iterator<T> iterator2;
        boolean even = true;

        @Override
        public Iterator<T> iterator() {
            return this;
        }

        public ZipIterator(Stream<T> first, Stream<T> second) {
            iterator1 = first.iterator();
            iterator2 = second.iterator();
        }

        public boolean hasNext() {
            return iterator1.hasNext() && iterator2.hasNext();
        }

        @Override
        public T next() {
            return (hasNext() && even)
                    ? addEven()
                    : addOdd();
        }

        public T addEven() {
            even = false;
            return iterator1.next();
        }

        public T addOdd() {
            even = true;
            return iterator2.next();
        }
    }
}
