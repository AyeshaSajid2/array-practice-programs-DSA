//Linear and binary Searching of array element

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi there !");
        int sz,ITEM,loc; //sz is size of array, ITEM is item to search in array

        System.out.println("\n Enter Size of array:");
        sz = sc.nextInt();

        int []arr = new int[sz];
        System.out.println("\n Enter array elements:");
        for (int i = 0; i < sz; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ch;
        System.out.println("\tEnter 1 for linear search\n\tEnter 2 for binary search");
        ch= sc.nextInt();
        switch (ch){
            case 1:{
                System.out.println("\n Enter element to search:");
                ITEM = sc.nextInt();
                for(loc = 0; loc < sz; loc ++)
                {
                    if(arr[loc] == ITEM)
                    {
                        System.out.println("The item found at INDEX " + loc);
                    }
                }
            break;
            }
            case 2: {
                System.out.println("\n\t\t Binary Search \n Enter Element to search");
                int item = sc.nextInt();
                int temp = 0;
                int U_B, mid, L_B;
                U_B = sz;
                L_B = 0;
                mid = (U_B + L_B) / 2;
                while ((arr[mid] != item) && (U_B != L_B)) {
                    if (arr[mid] < item) {
                        L_B = mid;
                    }
                    else
                        U_B = mid;
                        mid = (U_B + L_B) / 2;
                }
                System.out.println("The item found at INDEX " + mid);
                break;
            }
            default:
                System.out.println("WRONG INPUT");
        }
    }
}

