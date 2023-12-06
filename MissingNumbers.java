package com.array;
import java.util.Scanner;
public class MissingNumbers {
	 public static void main(String[] args) {

		
		   int[] a = {1,2,3,4,6,7};
		    
		   for (int i=0;i<=a.length;i++) {
			   int count=0;
		   
		   for(int j = i+1;j<=a.length;j++) {
			   
		   
		   if(i==a[j]) {
			   count++;}
			   if(count==0);
			   System.out.println();
		   }
		       System.out.println(i );
			   //System.out.print("\n");
		  }
		 }}

