package com.ll.exam1;

public class MyArrayList<T> {
    private String[] data = new String[2];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean add(String element) {
        makeNewDataIfNotEnough();
        data[size] = element;

        size++;
        return true;
    }

    private void makeNewDataIfNotEnough() {
        if (ifNotEnough()) {
            makeNewData();
        }
    }

    private boolean ifNotEnough() {
        return size >= data.length;
    }

    private void makeNewData() {
        String[] newData = new String[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    public String get(int index) {
        return data[index];
    }
}
