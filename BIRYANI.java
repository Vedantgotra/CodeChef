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
		int i;
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(i=0;i<a;i++){
		int x=sc.nextInt();
		int y =sc.nextInt();
	    arr[i]=x*y;
		}
		for(i=0;i<a;i++){
		    System.out.println(arr[i]);
		}
	}
}
