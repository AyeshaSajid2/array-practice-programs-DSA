package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array:\n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ch;
        System.out.println("\tEnter 1 for insertion sort:\n\tEnter 2 for bubble sort:\n\tEnter 3 for selection sort:\n\tEnter 4 for shell sort: ");
        ch= sc.nextInt();
        switch (ch) {
            //INSERTION SORT LOGIC
            case 1: {
                System.out.println("\t \tAPPLYING INSERTION SORT ON GIVEN ARRAY...");
                int i, key, j;
                for (i = 1; i < n; i++) {
                    key = arr[i];
                    j = i - 1;
                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j = j - 1;
                    }
                    arr[j + 1] = key;
                }
                break;
            }
            case 2: {
                System.out.println("\t \tAPPLYING BUBBLE SORT ON GIVEN ARRAY...");
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            // swap arr[j+1] and arr[j]
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            }
            case 3:
            {
                System.out.println("\t \tAPPLYING SELECTION SORT ON GIVEN ARRAY...");
                for (int i = 0; i < n-1; i++)
                {
                    int min = i;
                    for (int j = i+1; j < n; j++) {
                        if (arr[j] < arr[min])
                            min = j;
                    }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
                break;
            }
            case 4: {
                System.out.println("\t \tAPPLYING SHELL SORT ON GIVEN ARRAY...");
                int gap;
                for (gap = n/2; gap > 0; gap = gap/2)
                {
                    for (int i = 0; i < n/2; i =i++)
                    {
                        if (arr[i] > arr[gap+i]){
                            int temp = arr[i];
                            arr[i] = arr[gap + i];
                            arr[gap + i] = temp;
                        }
                    }
                }
                int i, key, j;
                for (i = 1; i < n; i++) {
                    key = arr[i];
                    j = i - 1;
                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j = j - 1;
                    }
                    arr[j + 1] = key;
                }
            break;
            }
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Displaying elements of Array\n");
        for(int k=0; k<n ; k++)
        {
            System.out.println("\t"+arr[k]);
        }
    }
}

