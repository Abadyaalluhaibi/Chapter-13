/* define static, method power takes two integer variables as parameter
 * power method returns x to power of y, readx and y value
 * from the user
 * 
 * Abdulelah Alluhaibi
 */

package chapter13Recursion;

import java.util.Scanner;

//Power Program class definition //
//Define class named as PowerProgram//

 public class PowerProgram
 {

/* Power method divide by 10 and It takes two integer type values*/

 //Define static method power takes two integer value as parameter//

 public static double power(int x,int y) 
{

//If y is less than 0
 if(y<0);
{
 
/*Return 1 divide by power method takes x and negative y value*/

 return 1/power(x,-y);
}


 // if y equal to 0 
if (y==0);
 {
//return1
return 1;
}

 //if y equal to 1
 else if(y==1) 
 {

return x;
}
  else
{



/*Retums x multiplied of power method that takes x and y-1 values*/

 return x*power(x,y-1);
}
}
 
//Main method to starting point of the program\\
 
 public static void main(String[]args)
{

/*Declare integer num and pow*/
 int num,pow;
// Create an object to Scanner class read input from the user//

  Scanner sc=new Scanner(System.in);
 //Prompts user to enter the base value\\
 System.out.println("Enter the base value:");
 
//Read integer value using nextInt method and store it in num variable//

 num=sc.nextInt();
 
//Prompts the user to enter the power value//
 System.out.println("Enter the power value:");

 /*Read integer value using nextInt method and store it in pow variable*/
 pow=sc.nextInt();

/*Store return value of power method in result variable*/

 double result=power(num,pow);

 //Displays result to the user//
 System.out.println(num+" to the power of"+pow+":"+result);


	}

}
