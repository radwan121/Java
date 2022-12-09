package Codes.exception_handling;

public class Exception_handling_P2 
{
   //HERE EXCEPTION OCCURS
   void method1()
   {
       int arr[] = {10,20,30};
       System.out.println(arr[5]);
   }
   void method2()
   {
       method1();
   }
   void method3()
   {
       try
       {
           method2();
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Exception got caught.....");
       }
   }
   
   public static void main(String[] args)
   {
    Exception_handling_P2  obj = new Exception_handling_P2 ();
       obj.method3();
   }
       
}