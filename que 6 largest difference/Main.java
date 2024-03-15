package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        int n,diff=0;
        System.out.println("Enter size of array:");
        n= sc.nextInt();
        arr = new int[n];

        System.out.println("Enter array elements:");
        for(int k=0; k<n ; k++)
        {
            arr[k] = sc.nextInt();
        }
        System.out.println("Displaying elements of Array\n");
        for(int k=0; k<n ; k++)
        {
            System.out.println("\t"+arr[k]);
        }
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 1 ; j < n ; j++)
            {
                if ((arr[j] - arr[i]) > diff )
                    diff = arr[j] - arr[i];
            }
        }
        System.out.println("Maximum difference = "+ diff);
    }
}
