package ir.mindsheets.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private String[] value;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {

        value = new String[capacity];

    }

    public void add(String val) {
        if (back == value.length) {
            String[] newValue = new String[value.length * 2];
            System.arraycopy(value, 0, newValue, 0, value.length);
            value = newValue;
        }

        value[back] = val;
        back++;
    }

    public String remove() {
        if (size() == 0)
            throw new NoSuchElementException();

        String v = value[front];
        value[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return v;

    }

    public int size() {
        return back - front;
    }

    public String peek() {
        if (size() == 0)
            throw new NoSuchElementException();

        return value[front];

    }

    public void print() {
        for (int i = front; i < back; i++) {
            System.out.print(value[i]);
        }
        System.out.println("--------------------");
    }

}
