//Que. 23

import java.util.Scanner;
class BinaryToHex
{
 public static void main(String [] args)
 {
  int num1;
  Scanner ambani= new Scanner(System.in);
  num1= Integer.parseInt(ambani.nextLine(),2);
  System.out.println(Integer.toHexString(num1));
  }
}