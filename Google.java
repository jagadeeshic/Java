/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   int T=0,N=0,S=0;
	   Scanner sv = new Scanner(System.in);
	    T = sv.nextInt();
	   int A[][] = new int[T][2];
	   int B[][] = new int[T][];
	   System.out.println(T);
	   for(int i = 0;i<T; i++)
	   {
	   	System.out.println("A");
	       A[i][0]=sv.nextInt();
	       System.out.println("B");
	       A[i][1]=sv.nextInt();
	       System.out.println("C");
	       int k=A[i][i];
	       B[i]=new int[k];
	       System.out.println("D");
	       
	       System.out.println("hhh"+B.length);
	       System.out.println(B[0].length);
	       
	       System.out.println("D------>"+A[i][i]);
	       
	       for(int j=0; j<A[i][i]; j++)
	       {
	           B[i][j]=sv.nextInt();
	       }
	   }
	   
	    for(int i = 0;i<T; i++)
	   {
	       System.out.println(A[i][1]);
	       System.out.println(A[i][i+1]);
	       
	       for(int j=0; j<A[i][i]; j++)
	       {
	           System.out.println(B[i][j]);
	       }
	   }
	   
	}
}




