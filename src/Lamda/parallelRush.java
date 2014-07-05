package Lamda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;import java.util.Random;


public class parallelRush {
	public static void main (String args[]){
		long start;
		long end;
//		for(long l = 100;l< 100000000;l=l*10){
		for(long l = 1;l< 1000;l=l+1){
			doCheck(l);
		}
	}

	private static void doCheck(long yousosu) {
		System.out.print("—v‘f”," + yousosu+",");
		long start;
		long end;
		List<Long> list = new ArrayList<Long>();
		for(long l=1;l<yousosu;l++){
			//System.out.println(l);
			list.add(l);
		}
		
		SimpleDateFormat DF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		start = System.currentTimeMillis();
		list.forEach(x -> {
				long l;
				for(int i = 0;i<1000000;i++){
					l = x +x;
				}
		});
		end = System.currentTimeMillis();
		System.out.print((end - start) + "ms,");
		
		start = System.currentTimeMillis();
		list.parallelStream().forEach(x->{
				long l;
				for(int i = 0;i<1000000;i++){
					l = x +x;
				}
			});
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}
	
}
