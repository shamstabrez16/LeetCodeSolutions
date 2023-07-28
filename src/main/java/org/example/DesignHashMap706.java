package org.example;

import java.util.Arrays;

public class DesignHashMap706 {

    int[] map  = null;
    public DesignHashMap706() {
        map = new int[(int) (Math.pow(10,6)+1)];
        Arrays.fill(map,-1);
    }

    public void put(int key, int value) {
        map[key] =key + value;
    }

    public int get(int key) {
        return  map[key] ;
    }

    public void remove(int key) {
        map[key]=-1;
    }
}
