package Lamda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class parallelTest1 {
	public static void main (String args[]){
		long start;
		long end;
		List<Integer> list = Arrays.asList(1,2,3);
		SimpleDateFormat DF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		System.out.println("シングル処理開始");
		start = System.currentTimeMillis();
		list.forEach(x -> {
			try { Thread.sleep(1000); } catch(Exception e){}
			System.out.println(DF.format(new Date()) + ":" + x);
		});
		end = System.currentTimeMillis();
		System.out.println("処理時間:"+(end - start) + "ms");
		
		System.out.println("パラレル処理開始");
		start = System.currentTimeMillis();
		list.parallelStream().forEach(x->{
			try { Thread.sleep(1000); } catch(Exception e){}
			System.out.println(DF.format(new Date()) + ":" + x);
		});
		end = System.currentTimeMillis();
		System.out.println("処理時間:"+(end - start) + "ms");
	}
	
	@FunctionalInterface
	private interface Calculator {
		public int cal(int num1);
	}
}
