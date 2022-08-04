/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int p[]=new int[5];
		int count=0,i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<p.length-1;i++){
		    p[i]=sc.nextInt();
		}
			for(i=0;i<p.length-1;i++){
			    if(p[i]>=10){
			        count++;
			    }
			}
		System.out.println(count);
	}
}
