package Stream;

import java.util.ArrayList;
import java.util.List;


public class StreamMain {
    public static void main (String[] args){

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            numbers.add((int) (Math.random() * 100) + 1);
        }

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*2)
                .sorted()
                .forEach(System.out::println);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Summe: [" + sum + "]");

        List<Integer> newNumbers;
        newNumbers = new ArrayList<>(numbers);

        newNumbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*2)
                .sorted()
                .forEach(System.out::println);

    }
}

