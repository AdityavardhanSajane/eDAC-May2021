// Que. 3

import java.util.Scanner;
public class DivisionOfTwoNumbers
{
   public static void main (String[] args)
 {
	 int num1, num2, division;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first number:  ");
	 num1 = sc.nextInt();
	 
	 System.out.println("Enter second number:  ");
	 num2 = sc.nextInt();
	 
	 sc.close();
	 
	 division = num1 / num2;
	 System.out.println("Division of two numbers is: "+division);
     
 }
}