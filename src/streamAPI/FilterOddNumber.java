package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumber {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(15);
        l1.add(20);
        l1.add(25);
        l1.add(30);

        
        List<Integer> oddList = l1.stream()
                                  .filter(n -> n % 2 != 0)
                                  .collect(Collectors.toList());

        System.out.println(oddList);
    }
}
