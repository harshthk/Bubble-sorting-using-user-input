package com.company;

import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr){
        // for loop for output the single array.
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
	// write your code here
        // Creating array using input method
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        // for loop for intput the single array.
        for(int i=0; i<size;i++){
            System.out.print("Enter the value of "+i+" :-");
            arr[i] = scan.nextInt();
        }
        //bubble sorting user input value
        for (int i=0; i< arr.length-1;i++){
            for(int j=0; j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        printArray(arr);
    }
}
