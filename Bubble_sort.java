package Codes;

import java.util.Scanner; //Importing header class for input 

public class Bubble_sort
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n,i,j,temp;
        n=input.nextInt(); //Taking size of the array

        int[] arr; //Declaring an integer array
        arr = new int[n]; //Mentioning the size of the array

        //Taking input
        for(i=0; i<n; i++)
        {
            arr[i] = input.nextInt();
        }

        //Printing array
        System.out.print("Original: ");
        for(i=0; i<n; i++)
        {
            System.out.print(" "+arr[i]);
        }

        //Bubble sort
        for(i=0; i<n; i++)
        {
            for(j=i+1; j<n; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(" ");
        //Printing sorted array
        System.out.print("Sorted: ");
        for(i=0; i<n; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}