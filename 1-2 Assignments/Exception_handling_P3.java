/*
 Write a java program show the exception propagation for checked exception
*/

package Codes.exception_handling;

import java.io.IOException;

public class Exception_handling_P3
{
   void func() throws IOException
   {
       throw new IOException("System error...");
   }
   
   void func2()
   {
       try 
       {
           func();
       }
       catch(Exception e)
       {   
           System.out.println(e);
       }
   }
   
   public static void main(String[] args)
   {
       Exception_handling_P3 obj = new Exception_handling_P3();
       obj.func2();
   }
   
}
