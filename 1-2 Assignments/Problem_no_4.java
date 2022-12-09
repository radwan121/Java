/*
Show an exception handling program using nested try catch.
*/

package Codes;

class Problem_no_4
{
    public static void main(String[] args)
    {
        try
        {
            //INNER TRY BLOCK 1
            try
            {
                int result = 100/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
                System.out.println("Arithmetic exception got caught..");
            }  
            //INNER TRY BLOCK 2
            try
            {
                int arr[] = new int[5];
                arr[5] = 100;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.println("Array index out of bound occured...");
            }
        }
        catch(Exception e)
        {
            System.out.println("Handled the outer part...");
        }

        System.out.println("Rest of the codes...");

    }
}