package ua.intita.qa.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperExtand {
    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5.3);
        nums.add(BigDecimal.ONE);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(6);
       printNumbers(list);
    }

    public static void printNumbers(List<? extends Number> nums){
        nums.remove(0);
        for (Number num: nums){
            System.out.println(num);
        }
    }
}
