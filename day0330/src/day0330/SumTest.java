package day0330;

public class SumTest {

	public static void main(String[] args) {
		//1에서 n까지 합을 누적하는 프로그램
		int sum = 0;
		int i = 1;
		int n = 10;
		
		for (i=1; i<= n; i= i + 1) {
			sum += i;
		}
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
		
		System.out.println("1에서 "+ n + "까지의 합은 "+sum);
	}

}
