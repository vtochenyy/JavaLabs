package Lab1;

import java.util.*;

public class Lab1Service {
    private final List<Integer> numbers;
    private Integer median;

    public Lab1Service(Collection<Integer> numbers) {
        this.numbers = numbers.stream().toList();
    }
    public Lab1Service() {
        this.numbers = new ArrayList<>();
    }

    public void checkIsEquals() {
        int sizeOfMap = new HashSet<>(this.numbers).size();
        if (sizeOfMap == 1) {
            System.out.println("1. All of elements are equals");
        } else {
            System.out.println("1. The elements of collection not equals");
        }
    }

    public void printMaxElement() {
        Integer maxElement = this.numbers.stream().max(Comparator.comparingInt(x -> x)).orElse(0);
        System.out.println("2. Max value of collection = " + maxElement);
    }

    public void printMinElement() {
        Integer minElement = this.numbers.stream().min(Comparator.comparingInt(x -> x)).orElse(0);
        System.out.println("3. Min value of collection = " + minElement);
    }

    public void prinNAscNumbers(int count) {
        List<Integer> nAscNumbers = this.numbers.stream().sorted().limit(count).toList();
        System.out.println("4. The first " + count + " numbers in collection: " + nAscNumbers);
    }

    public void printMedianOfCollection() {
        List<Integer> hashSetToMedianOfColletion = new HashSet<>(this.numbers).stream()
                .sorted()
                .toList();
        this.median = hashSetToMedianOfColletion.get((hashSetToMedianOfColletion.size() - 1) / 2);
        System.out.println("5. Median of collection " + hashSetToMedianOfColletion + " is " + this.median);
    }

    public Integer printMedianOfCollection(Collection<Integer> c) {
        List<Integer> hashSetToMedianOfColletion = new HashSet<>(c).stream()
                .sorted()
                .toList();
        int median = hashSetToMedianOfColletion.get((hashSetToMedianOfColletion.size() - 1) / 2);
        return median;
    }

    public void printNMinimalValue(int n) {
        List<Integer> numbersAsc = this.numbers.stream().sorted().toList();
        System.out.println("6. First " + n + " minimal value of asc postition collection " + numbersAsc + " is " + numbersAsc.get(n));
    }


}
