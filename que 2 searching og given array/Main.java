package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,3,5,6,7,9,11};
        int n = arr.length;
        int ch;
        int ITEM = 7;
        System.out.println("WHICH SEARCHING ALGORITHM U WANT TO USE?\n\tPress 1 for LINEAR search:\n\tPress 2 for binary search: ");
        ch= sc.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("\t \tAPPLYING LINEAR SEARCH ON GIVEN ARRAY...");
                for (int loc = 0; loc < n; loc++) {
                    if (arr[loc] == ITEM) {
                        System.out.println("Desired element is " + ITEM);
                        System.out.println(" on location " + loc);
                        break;
                    } else if (arr[loc] == n)
                        System.out.println("Element not found in array");
                    break;
                }
            }
            case 2: {
                System.out.println("\t \tAPPLYING BINARY SEARCH ON GIVEN ARRAY...");
//                System.out.println("\n\t\t Binary Search \n Enter Element to search");
//                int item = sc.nextInt();
                int temp = 0;
                int item = 7;
                int U_B, mid, L_B;
                U_B = n;
                L_B = 0;
                mid = (U_B + L_B) / 2;
                while ((arr[mid] != item) && (U_B != L_B)) {
                    if (arr[mid] < item) {
                        L_B = mid;
                    } else
                        U_B = mid;
                    mid = (U_B + L_B) / 2;

                }
                System.out.println("The item found at INDEX  " + mid);
                break;
            }
            default:
                System.out.println("invalid input");
        }
        System.out.println("Displaying elements of Array\n");
        for(int k=0; k<n ; k++)
        {
            System.out.println("\t"+arr[k]);
        }
    }
    }

