package com.telran.org.homeworkseven;

import java.util.Iterator;

public class CustomIteratorApp {
    public static void main(String[] args) {

        CustomIterator customIterator = new CustomIterator(new int[]{12 , 13, 22, 1, 4});

        while (customIterator.hasNext()){
            int num = customIterator.next();
            System.out.print(num + " ");
        }
    }
}
