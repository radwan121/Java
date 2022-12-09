/* 
 Show an exception handling program with multiple catch in java
 */

package Codes;

class Problem_no_3
{
    public static void main(String[] args)
    {     
        try
        {
            int arr[] = new int[5];
            arr[6]=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Arithmetic Exception got caught..");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("Array index out of bounds exception got caught..");  
        }

        System.out.println("Rest of the codes...");

    }
}