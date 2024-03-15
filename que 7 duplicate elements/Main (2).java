package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        int n, diff = 0;
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter array elements in non-decreasing order, ascending order:");
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        System.out.println("Displaying elements of Array\n");
        for (int k = 0; k < n; k++) {
            System.out.println("\t" + arr[k]);
        }
        System.out.println("\t \tChecking repeated elements....");
        for (int i = 0 ; i < n-2 ; i++)
        {
            if (arr[i] == arr [i +1] )
            for (int j = i+2 ; j < n ; j++)
            {
                if (arr[i] == arr[j])
                {
                    i++;
                }
            }
            System.out.println("Duplicate Element are:" +arr[i]);
        }
    }
}