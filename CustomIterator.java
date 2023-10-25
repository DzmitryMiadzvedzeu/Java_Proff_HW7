package com.telran.org.homeworkseven;

import java.util.Iterator;

public class CustomIterator implements Iterator<Integer> {
    private int [] integers;
    private int position;

    public CustomIterator(int [] integers) {
        this.integers = integers;
        this.position = -1;
    }

    @Override
    public boolean hasNext() {
        return position < integers.length - 1;
    }

    @Override
    public Integer next() {
        int curent = integers[position + 1];
        position++;
        return curent;
   }
}
