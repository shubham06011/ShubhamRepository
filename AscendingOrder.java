package com.array;

public class AscendingOrder {
	public static void main(String[] args) {
		int a[] = {12,10,14,13,11,10};
		int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int d = a[i];
					a[i]=a[j];
					a[j]=d;
				}
			}
		}
		System.out.println("the Ascending order is");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
		
