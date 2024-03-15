package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        int n, neg_num = 0;
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter array elements:");
        for (int k = 0; k < n; k++)
        {
            arr[k] = sc.nextInt();
        }
        System.out.println("Displaying elements of Array\n");
        for (int k = 0; k < n; k++)
        {
            System.out.println("\t" + arr[k]);
        }
        int count = 0;
        int time = 1;
        for (int i = 0 ; i < n ; i++)
        {
            if (arr [i] < 0) {
                System.out.println(time + " negative element of array is " );
                System.out.println("\t arr[" + i + "] = " + arr[i]);
                count++;
                time++;
            }
        }
        System.out.println("Total number of negative integers are "+ count);
    }
}
