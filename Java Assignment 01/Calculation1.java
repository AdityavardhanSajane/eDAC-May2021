//Que. 6
import java.util.Scanner;
public class Calculation1
{
   public static void main (String [] args)
  {
   int num1,num2;
   System.out.println("Enter the first number : ");
   Scanner sc = new Scanner (System.in);
   num1 = sc.nextInt();
   System.out.println("Enter the second number : ");
   num2 = sc.nextInt();
   
   
   System.out.println(num1+"+"+num2+"="+(num1+num2));
   System.out.println(num1+"-"+num2+"="+(num1-num2));
   System.out.println(num1+"*"+num2+"="+(num1*num2));
   System.out.println(num1+"/"+num2+"="+(num1/num2));
   System.out.println(num1+"%"+num2+"="+(num1%num2));
  
  
  
  
  }

}

