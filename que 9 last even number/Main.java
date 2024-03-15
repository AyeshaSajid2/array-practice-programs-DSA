package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t \t TRAVERSING ARRAY ELEMENT ");
        System.out.println("Enter size of array: ");
        n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter Elements of Array:\n");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Displaying elements of Array\n");
        for(int k=0; k<n ; k++)
        {
            System.out.println("\t"+arr[k]);
        }

        int loc=0,c=0;
        System.out.println("Displaying even number of Array\n");
        for (int j = 0; j<=n; j++)
            {
                if (arr[j] % 2 == 0)
                {
                    loc = j;
                    c = arr[j];
                }
            }
        System.out.println("Displaying location of last even number in Array\n"+c);
        System.out.println("Displaying location of last even number in Array\n"+loc);


    }
}


