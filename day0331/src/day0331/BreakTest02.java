package day0331;

public class BreakTest02 {
	public static void main(String[] args) {
		int i;
		for(i=1; i<=10; i++) {
			
			if(i%3==0) { //해당 조건을 만나면 반복문 탈출.
				break;
			}
			System.out.println(i);
		}
		System.out.println("종료");
		System.out.println("반복문 탈출 후의 i값:"+i);
	}
}
