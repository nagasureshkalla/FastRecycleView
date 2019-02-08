package com.example.admin.fastrecycleview;

import android.support.annotation.NonNull;

public class Data implements Comparable<Data> {


    String name;
    static int size;

    public static int getSize() {
        return size;
    }

    public static void setSize(int size1) {
        size = size1;
    }

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NonNull Data o) {
        return getName().compareTo(o.getName());
    }
}
