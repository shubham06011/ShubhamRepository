package com.array;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int a[]= {40,5,20,60,10,50};
		
		for (int i=0;i<=a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					//System.out.println(a[i]);
					int x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
			}
		System.out.println("Descending order");
		for (int i=0;i<a.length;i++) {
			
			                     
		}
			
		System.out.println(a[1]);

		}
	}
	


