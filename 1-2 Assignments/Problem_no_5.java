/*
 Write a program in java and show exception handling and show the use of finally block
 */

package Codes;

class Problem_no_5
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int result;

        //TRY BLOCK 1
        try
        {
            arr[4] = 400;
            //NO ERROR
        }
        finally
        {
            System.out.println("No errors, good to go...");
        }
        //TRY BLOCK 2
        try
        {
            arr[2] = 10/0;//ERROR OCCURS
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught..."+e);
        }
        finally
        {
            System.out.println("Let's go, dealt with errors...");
        }
        //TRY BLOCK 3
        try
        {
            arr[6] = 100;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound..."+e);
        }
        finally
        {
            System.out.println("finally block ran successfully though...");
        }
    }
    
}