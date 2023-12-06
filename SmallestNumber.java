package com.array;

public class SmallestNumber {
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int max = a[0];
		for(int i =0; i<a.length;i++) {
			if(a[i] < max) {
			max=a[i];
		}
	}
   System.out.println("the Smallest number is " +max);

}}
