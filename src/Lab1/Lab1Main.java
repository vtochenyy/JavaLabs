package Lab1;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Lab1Main {
    public static void main(String[] args) {
        try {
            String readedData = Files.readString(Paths.get("./resources/data.txt"), StandardCharsets.UTF_8);
            Collection<Integer> numbers = Arrays.stream(readedData.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            Lab1Service lab1Service = new Lab1Service(numbers);
            System.out.println(numbers);
            //Task1
            lab1Service.checkIsEquals();
            lab1Service.printMaxElement();
            lab1Service.printMinElement();
            lab1Service.prinNAscNumbers(9);
            lab1Service.printMedianOfCollection();
            lab1Service.printNMinimalValue(4);
        } catch (Throwable err) {
            System.out.println();
        }

    }
}