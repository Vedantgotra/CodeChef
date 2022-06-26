/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner sc=new Scanner(System.in);
      int len=sc.nextInt();
        for (int i = 0; i < len; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            for (int j = 0; j < n; j++) {
                    int x=sc.nextInt();
                    if(x<=k){
                    System.out.print(1);
                    k=k-x;
                    }
                    else{
                        System.out.print(0);
                    }
            }
            System.out.println();
        }
	}
}
