package com.array;

public class AssendingOrder {
	public static void main(String[] args) {
		int array[]={4,2,1,5,3};
		int temp = 0;
		for (int i =0;i<array.length;i++) {
			System.out.println(array[i] + "");
		}
		for(int i=0;i<array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("the elements are" );
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
	}

}
