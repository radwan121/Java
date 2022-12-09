/*
 Show an exception handling (single) program in java
 */
package Codes.Exceptions_handle_reports;

class Program
{
    public static void main(String[] args)
    {
        //DECLARING VARIABLES
        int a,b,result;
        a=10;
        b=0;

        //HERE RUN-TIME ERROR WILL ARISE.
        //ARITHMETIC EXCEPTION OCCURS
        result = a/b;

        //SHOWING OUTPUT
        System.out.println("Result"+result);

    }
}