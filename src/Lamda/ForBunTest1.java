package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ForBunTest1 {
	public static void main (String args[]){
		List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9,10,20);
		
		//�����܂�
		for(int i:list){
			System.out.println(i);
		}
		
		//forEach
		list.forEach((Integer x) ->	
			{
				System.out.println(x);
			}
		);
		
		list.forEach(x -> System.out.println(x));

		//filter����
		//5�ȉ����o�͂�������
		list.stream().filter(x -> x<5).forEach(x -> System.out.println(x));
		
		//�ő��l
		System.out.println(
				list.stream().map(x -> x).reduce(0, (x, y)->x > y ? x : y)
		);
		//max���\�b�h���p
		System.out.println(
				list.stream().max((x,y) -> x - y).get()
		);
		
		IntStream.range(0,10).parallel().forEach(x -> {
			System.out.println(Integer.toString(x) +':'+ Integer.toString(x+x));
		});
		
	}
}
