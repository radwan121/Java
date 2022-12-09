/*
Write a java program to demonstrate the use of throw keyword
*/

package Codes.exception_handling;

public class Exception_handling_P1
{
   public static void validate(int age)
   {
       if(age < 18)
       {
           throw new ArithmeticException("Not eligible for voting");
       }
       else
       {
           System.out.println("Eligible for voting");
       }
           
   }
    
   public static void main(String[] args) 
   {
      validate(19);
      
      System.out.println("Rest of the codes...");
   }
   
}
