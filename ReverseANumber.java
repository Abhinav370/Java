import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main
{
  static int rev = 0;
  public static void reverse (int num)
  {
    if (num <= 0)
      return;
    int rem = num % 10;
      rev = (rev * 10) + rem;
      reverse (num / 10);
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter any Number:");
    int n = sc.nextInt ();
    reverse (n);
    System.out.println ("Reversed Number is:\n" + rev);
  }
}
