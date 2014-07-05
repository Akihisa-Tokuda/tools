package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
	
public class InnerClass {
	public static void main(String[] args) {
		Hello hello = (str,st2) -> 
		{
			System.out.println("Hello java world : " + str);
			System.out.println("Hello java world : " + st2);
		};
		
		hello.show("Java8","Lamda");

		hello.show("test","Lamda");

		//匿名クラス
		Calculator cal1 = new Calculator(){
			public int cal(int num1,int num2){
				return num1 + num2;
			}
		};		
		System.out.println(cal1.cal(1, 2));
		
		//ラムダ式
		Calculator cal4 = (int num1,int num2) -> {
			return num1 + num2;
		};
		
		Calculator cal2 = (num1,num2) -> num1 + num2;
		System.out.println(cal2.cal(1,2));
		
		Calculator cal3 = (num1,num2) -> num1*num1;
		System.out.println(cal3.cal(2,2));

		//java.util.functionパッケージ
		Function<Integer,Integer> func = (x -> x+x);
		System.out.println(func.apply(100));
	}
	
	@FunctionalInterface
	private interface Hello {
		public void show(String str,String st2);
	}
	
	@FunctionalInterface
	private interface Calculator {
		public int cal(int num1,int num2);
	}
	
}