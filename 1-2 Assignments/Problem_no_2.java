/*
Show an exception handling program and handle the exception using try catch
*/
package Codes;

class Problem_no_2
{
    public static void main(String[] args)
    {
        //DECLARING VARIABLES
        int a,b,result;
        a=10;
        b=0;

        //WILL CAUSE ARITHMETIC ERROR
        //result=a/b;

        //HERE THE EXCEPTION IS HANDLING CAREFULLY
        try
        {
            result = a/b;
        }
        catch(ArithmeticException e)//HANDLES THE EXCEPTION
        {
            System.out.println(e);
        }
        System.out.println("Rest of the codes run sucessfully....");

    }
}
