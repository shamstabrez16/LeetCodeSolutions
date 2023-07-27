package org.example;

public class MyHashSet705 {
    int[] array = null;
    boolean isZeroAdded = false;

    public MyHashSet705() {
        array = new int[1000000];
    }

    public void add(int key) {
        if(key==0){
            isZeroAdded = true;
        }
        array[key] = key;
        System.out.println("added : "+key);
    }

    public void remove(int key) {
        if(key==0){
            isZeroAdded = false;
        }
        array[key] = 0;
        System.out.println("removed : "+key);

    }

    public boolean contains(int key) {
        if(key==0){
           return isZeroAdded;
        }
        return array[key] == key;
    }
}
