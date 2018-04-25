/* convert Dec method converts decimal number to any base number
 * read two number from the user.
 * 
 * Abdulelah Alluhaibi
 */

package chapter13Recursion;

import java.util.Scanner;

public class DecimalConversions
{
	//convertDec method invokes by dividing by base. It takes two integer type value. 

	/*Define static method convertDec takes two integer variables*/
 public static void convertDec(int num,int base)
{

 //if num is 0//
 if(num==0)
{

 //if base is 0//
 if(base==2)

 //displays 0 
System.out.print(0);
}

//if num is greater than 0//
 else if(num>0)
{

 //invokes convertDec method by dividing num by base\\

 convertDec(num/base,base);

 //if remainder of Dum by base is greater than 10\\

if((num%base)>10) 

//Displays alphabets instead of number//
 System.out.print((char)(55+(num%base)));

 else
// Displays numbers//


	 System.out.print(num%base);

}
 
}


//Main function for starting point of the program.
 
 public static void main(String[]args)
 {

 //Declare integer variable number and baseVal\\
 int number,baseVal;
//Create an object to Scanner class to read input from the user//

 Scanner sc=new Scanner (System.in);
 
//Prompts user to enter the decimal number\\
 System.out.print("Enter the decimal number:");

 //Read integer value using next nt method and store it in number//

 number=sc.nextInt(); 
//Prompts user to enter the base value\\

 System.out.print("Enter the base value which to be converted:");
  
//Read integer value using nextint method and store it in baseval\\

 baseVal=sc.nextInt();
 
 System.out.print("Converted number:");


 //calls convertDec passes number and baseval values\\

 convertDec(number,baseVal);
 

 

	}

}
