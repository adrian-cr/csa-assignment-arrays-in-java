package com.cognizant;

import java.util.Arrays;
import java.util.Random;

public class Part4 {
  public static void main(String[] args) {
    /* 1. Create an array of 10 integers. */
    int[] array = new int[10];
    /* 2. Fill the array with multiples of 3. */
    for (int i=0; i<10; i++) {
      array[i] = new Random().nextInt(100) * 3;
    }
    /* 3. Print the length of the array and all its elements. */
    System.out.println("Array length: " + array.length);
    System.out.println("Array elements: " + Arrays.toString(array));
  }
}
