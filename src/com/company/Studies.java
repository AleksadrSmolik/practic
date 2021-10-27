package com.company;

import java.util.ArrayList;
import java.util.List;

public class Studies {
    public static void main(String[] args) {
    Dead_FLAME FOX = new Dead_FLAME("Roman", "Shytov", "Aleksandrovich");
    Dead_FLAME FOX1 = new Dead_FLAME("Aleksey", "Gribkov", "Vladimirovich");

    List<Dead_FLAME> Fox = new ArrayList<>();
    Fox.add(FOX);
    Fox.add(FOX1);


    for (Dead_FLAME ad: Fox) System.out.println(ad);

    }
}
