package com.telran.org.homeworkseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HomeworkSevenApp {
    public static void main(String[] args) {

        List<Integer> amount = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            amount.add(i);
        }

        long start = System.currentTimeMillis();
        for (Integer i : amount) {
            Integer temp = i;
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("First time for execute is " + (end - start));

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < amount.size(); i++) {
            int integer = amount.size();
        }
        System.out.println();
        long end2 = System.currentTimeMillis();
        System.out.println("Second time for execute is " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        int size = amount.size();
        for (int i = 0; i < size; i++) {
            int integer = size;
        }
        System.out.println();
        long end3 = System.currentTimeMillis();
        System.out.println("Third time for execute is " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        int size1 = amount.size();
        for (int i = size1; i > 0; i--) {
            int integer = size1;
        }
        System.out.println();
        long end4 = System.currentTimeMillis();
        System.out.println("Fourth time for execute is " + (end4 - start4));

        long start5 = System.currentTimeMillis();
        Iterator<Integer> iterator = amount.iterator();
        while (iterator.hasNext()){
            int ingteger = iterator.next();
        }
        long end5 = System.currentTimeMillis();
        System.out.println("Fivth time for execute is " + (end5 - start5));

        long start6 = System.currentTimeMillis();
        ListIterator<Integer> iterator1 = amount.listIterator();
        while (iterator1.hasNext()){
            boolean ingteger1 = iterator1.hasNext();
        }
        long end6 = System.currentTimeMillis();
        System.out.println("Sixth time for execute is " + (end6 - start6));
    }
}
