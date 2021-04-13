package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] a = {13, 22, 10, 5, 1};
	boolean end = false;
    while (!end){
        end = true;
        for(int i = 0; i < a.length - 1; i++){
            if (a[i] > a[i+1]){
                int replace = a[i];
                a[i] = a[i+1];
                a[i+1] = replace;
                end = false;
            }
        }
    }
        System.out.println(Arrays.toString(a));
    }
}
