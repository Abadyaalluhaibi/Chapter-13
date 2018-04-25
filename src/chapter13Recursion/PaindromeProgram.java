package chapter13Recursion;

import java.util.Scanner;

//Define class named as PalindromeProgram
public class PaindromeProgram 
{


/*Define static method palindrome takes string and integer variable*/

public static boolean palindrome(String s,int num) 
{

//stores length of string in length variable

int length =s. length();

// if num equals to (ength-1) 

if(num==length-1)
//Returns true 

return true;

/*if each character of string equals to reverse of each character */

else if(s.charAt(num)== s.charAt((length-1)- num))
/*Returns palindrome method by incrementing by 1*/

return palindrome(s,num+1);
else
//Returns false 
return false ;
}


//Main method 

public static void main(String[] args)

{ 
//Declare string variable str
String str;

/*Create an object to Scanner class to read input from the user*/

Scanner sc= new Scanner (System.in); 
 
//Prompts user to enter the string

System.out.println("Enter the string:");

/*Read string using next method and store it in str*/

str=sc.next();

//Declare integer variable of n and assign to 0 //

int n= 0;


/*declare valid variable of boolean type and returns palindrome method*/


boolean valid=palindrome(str,n);

//Check the valid condition and display the result//

/*if valid is true*/

if(valid==true)

//Displays palindrome to the user
System.out.println("Palindrome");

//Displays not palindrome to the user

else 
System.out.println("Not a palindrome");


	}

}
