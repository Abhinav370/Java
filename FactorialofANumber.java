// Java Program to find the factorial of a number using Recursion 
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static int factorial(int num)
    {
        // Handling Base Cases and Corner Cases
        if(num == 0 || num == 1)
        {
            return 1;
        }
        return num*factorial(num-1);  // similar to n!= n*(n-1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of the number is:\n"+factorial(n));
    }
}