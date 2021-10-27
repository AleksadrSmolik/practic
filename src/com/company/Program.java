package com.company;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(2, 3, 5, 8, 4, 6, 3, 1, 12, 16));
//        System.out.println(pozitive(array));
        System.out.println(division(7, 4, 3, 2));
        System.out.println(evenNum(array));
         System.out.println(random(5,50));
    }
//     public static int pozitive(List<Integer> list) {
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
    public static long division(int... a) {
        long res = (1);
        for (int el: a)
        {
            res *= el;
        }
        return res;
    }

    public static List<Integer> evenNum(List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        for (Integer el : list) {
            if (el % 2 == 0){
                res.add(el);
            }
            
        }
        return res;
    }
     public static List<Integer> random(int count, int upbor) {
        List<Integer> mas = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            mas.add(random.nextInt(upbor));


        }
        return mas;
    }

}

