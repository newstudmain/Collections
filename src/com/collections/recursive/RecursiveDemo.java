package com.collections.recursive;


public class RecursiveDemo {


	public static void main(String[] args) {
		System.out.println(factorial_Rec(3));
		System.out.println(factorial_Iter(3));
		writeBinary(10);
		System.out.println();
		System.out.println(fibonacci(11));
		
	}
	
	//阶乘[递归]
	public static long factorial_Rec(int n) {
		if(n<0) 
			throw new IllegalArgumentException();
		if(n<=1) 
			return 1;
		return n*factorial_Rec(n-1);
	}
	
	//阶乘[迭代]
	public static long factorial_Iter(int n) {
		int product =n;
		if(n<0) 
			throw new IllegalArgumentException();
		if(n==0) 
			return 1;
		for(int i=n-1;i>1;i--) 
			 product=product*i;
		return product;
	}
	
	//十进制转二进制
	public static void writeBinary(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		if(n<=1)
			System.out.print(n);
		else {
			writeBinary(n/2);
			System.out.print(n%2);
		}
	}
	
	//fibonacci
	public static long fibonacci(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
