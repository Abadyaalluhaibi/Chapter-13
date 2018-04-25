package chapter13Recursion;

import java.util.Scanner;

//Define class named as ReverseProgram\\

public class Reverseprogram 
{
/*Define static method reverse takes string and integer variable*/

 public static void reverse(String s, int num)
 {

 //stores length of string in length variable//

 int length=s.length();
 

//if num equals to (length-1)

 if(num==length-1)

 /*Displays character of string at position num*/

 System.out. print (s.charAt(num));

 else 
{

/*'invokes reverse method recursively by incrementing num by 1*/

 reverse(s,num+1);

 /*Displays character of string at postion num*/

 System.out.print(s.charAt(num));
 
 
		}
 }

//Main method//
 
public static void main(String[]args)
{

//Declare string variablestr//

 String str;

/* Declare integer variable and assign value 0 to N*/

 int n=0;

 /*Create a Scanner Class's object*/

 Scanner sc=new Scanner(System.in);
 

//Prompt and read the input

 /*Prompts user to enter the string*/
 
System.out.println("Enter the string");

 /*Read string using nextLine method and store it in str*/

str=sc.nextLine();


 //Display the reverse of the string\\
 System.out.println("The reverse of a given string is:");

/*Calls invokes reverse method passing str and n values*/
 
reverse(str,n);



	}

}
