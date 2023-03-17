package Lab2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Lab2Main {
    public static void main(String[] args) {
        Lab2Service lab2Service = new Lab2Service();
        //task1
        Collection<Integer> cll = lab2Service.printDescCollection(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        System.out.println("2. Переупорядочивание последовательности и вывод её значений в порядке убывания: " + cll);
        Integer median = lab2Service.getMedianOfColleciton(cll);
        System.out.println("3. Медиана последовательности = " + median);
        //task2
        System.out.println("3. ");
    }
}
