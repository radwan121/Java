package Codes;

import java.util.*;

public class Prime_numbers_sorting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int t,i,j,num,count=0;
        int[] arr = new int[100];
        t = input.nextInt();

        for(i=1; i<=t; i++)
        {
            num = input.nextInt();
            if(prime_check(num))
            {
                arr[count] = num;
                count ++;
            }
            Arrays.sort(arr, 0 ,count);
        }

        System.out.print("Sorted: ");
        for(i=0; i<count; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    static boolean prime_check(int x)
    {
        if(x == 0 || x == 1)
        {
            return false;
        }

        for(int i=2; i<x/2; i++)
        {
            if(x%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
