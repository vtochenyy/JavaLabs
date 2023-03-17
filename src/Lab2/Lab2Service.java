package Lab2;

import Lab1.Lab1Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

public class Lab2Service {

    // Task1

    public Collection<Integer> printDescCollection(Collection<Integer> c) {
        return c.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    public Integer getMedianOfColleciton(Collection<Integer> c){
        Lab1Service lab1Service = new Lab1Service();
        return lab1Service.printMedianOfCollection(c);
    }

    // Task2

    public String toString(Object array, String stringIfNull){
        if (Objects.equals(array, null)){
            return stringIfNull;
        } else {
            return array.toString();
        }
    }

    //task3
}
