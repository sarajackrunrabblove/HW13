package hw13.Q2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2{
    public static void main(String[] args) {
        List<String> listOfNames=new ArrayList<>();
        listOfNames.add("Mojtaba");
        listOfNames.add("Mehran");
        listOfNames.add("Amir");
        listOfNames.add("Hatef");
        listOfNames.add("Mohammad");
        listOfNames.add("Ali");
        listOfNames.add("Davood");
        listOfNames.add("Reza");
        listOfNames.add("Mohsen");


        //PART A
        System.out.println("PART A: ");
        Map<Integer, List<String>> result=listOfNames.stream().collect((Collectors.groupingBy(String::length)));
        System.out.println(result);
        System.out.println("***********************************************");
        //PART B
        System.out.println("PART B: ");

        System.out.println("***********************************************");
        Map<String, Long> countByName = listOfNames.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Group by count : "+countByName);
    }
}
