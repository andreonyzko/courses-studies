import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listInteger = List.of(1, 4, 7, 4, 0);
        List<String> listString = List.of("Andre", "Kaua", "Lucas", "Kaue");

        // DECLARATIONS
        Stream<Integer> integers= listInteger.stream();
        Stream<String> strings = Stream.of("Andre", "Kaua", "Lucas", "Kaue", "Andre");
        Stream<Integer> integersAuto = Stream.iterate(0, x -> x+1);

        // OPERAÇÕES INTERMEDIARIAS
        // filter, map, flatmap, peek, distinct, sorted, skip, limit
        integersAuto = integersAuto.limit(20);
        Stream<Integer> evens = listInteger.stream().filter(x -> x % 2 == 0);
        Stream<Integer> multiplied = listInteger.stream().map(x -> x*5);
        Stream<Integer> noDuplicates = listInteger.stream().distinct();
        Stream<Integer> sorted = listInteger.stream().sorted();
        Stream<String> skipping = listString.stream().skip(2);
        
        // OPERAÇÕES TERMINAIS
        // forEach, forEachOrdered, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny
        int amount = (int)listInteger.stream().count();
        System.out.printf("Integers (%d): ", amount);
        integers.forEach(x -> System.out.print(x + " "));
        System.out.println();

        int sum = listInteger.stream().reduce(0, (tempSum, x) -> tempSum + x);

        List<Integer> listEvens = evens.collect(Collectors.toList());

        boolean anyMatch = listString.stream().anyMatch(x -> x.equals("Andre"));
        boolean allMatch = listString.stream().allMatch(x -> x.equals("Andre"));
        boolean noneMatch = listString.stream().noneMatch(x -> x.equals("Andre"));

        // PRINTS COM .toArray()
        // System.out.println(": " + Arrays.toString());
        System.out.println("Strings: " + Arrays.toString(strings.toArray()));
        System.out.println("Integers Auto Generated: " + Arrays.toString(integersAuto.toArray()));
        System.out.println("Evens in Integers: " + listEvens.toString());
        System.out.println("Integers multipled by five: " + Arrays.toString(multiplied.toArray()));
        System.out.println("No duplicates Integers: " + Arrays.toString(noDuplicates.toArray()));
        System.out.println("Sorted Integers: " + Arrays.toString(sorted.toArray()));
        System.out.println("Strings two skipped: " + Arrays.toString(skipping.toArray()));
        System.out.println("Integers sum: " + sum);
        System.out.println("Andre is at strings? " + anyMatch);
        System.out.println("All at strings are Andre? " + allMatch);
        System.out.println("Andre is out strings? " + noneMatch);
    }
}
