import java.util.*;

public class Main
{
  public static int printFib(int n)
  {
    if(n<=1)
    return n;
    
    // recursively calling recurrence relation 
    return printFib(n-1)+printFib(n-2);
  }
  public static void main(String[]args)
  {
    /* code */
    int N = 20;
    for(int i=0;i<N;i++)
    {
        System.out.print(printFib(i)+" ");
    }
  }    
}
