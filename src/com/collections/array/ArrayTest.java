package com.collections.array;

public class ArrayTest {

	/*
	 * 分配内存空间：5个String对象的引用变量，调用String默认构造函数5次，赋初值null
	 * 返回索引变量：内存存储空间起始位置索引变量。
	 * 
	 * String对象引用变量存储在names变量中，指定数组中某个元素时，需要使用索引值。
	 * 
	 * 大小在创建时确定，在内存中是连续存储的。
	 * 大小固定，空间需要在使用前提前分配好。
	 * 插入或移除元素时，效率低。
	 * 
	 * */
	
	public static void main(String[] args){
		
		String[] names = new String[5];
		
		System.out.println(names);//[Ljava.lang.String;@3654919e
		
		names[0] ="";// null null null null 
		names[2] ="test";// null test null null 
		
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+" ");//null null null null null 
		}
		
		
	}
}
