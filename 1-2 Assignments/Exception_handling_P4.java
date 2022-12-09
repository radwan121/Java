/*
 Write a java program to create a custom exception then show a message to restrict the age 
number for voting.

*/

package Codes.exception_handling;

import java.net.SocketPermission;

//CREATING CUSTOM EXCEPTION
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
    }
}

public class Exception_handling_P4
{
    //USING CUUSTOM EXCEPTION
    static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Not valid to vote..");
        }
        else
        {
            System.out.println("Eligible to vote..");
        }
    }

    //MAIN 
    public static void main(String[] args)
    {
        try
        {
            validate(21);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Exception caught...");
            System.out.println("Exception is at"+ e);
        }

        System.out.println("rest of the codes....");
    }
   
}
