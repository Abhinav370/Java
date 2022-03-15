/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.Scanner;
public class Main             // JAVA Program to Reverse a String (Full Problem) using StringBuffer
{
	public static void main(String[] args) { // this is called main method in java 
	// it acts similar to int main() function in c++, this is the starting of our code
	    Scanner sc = new Scanner(System.in);   // create a scanner object
	    System.out.print("Input any String :\n");
		String str =  sc.nextLine();  // read user Input
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Reversed String is :\n"+sb);
	}
}
