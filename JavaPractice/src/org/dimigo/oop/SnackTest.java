package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  └SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class SnackTest {
	public static void main(String[] args) {
		SnackTest obj = new SnackTest();
		Snack[] snackArr ={
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칲","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)
		};
		obj.printArray(snackArr);
		
		
	}

	/**
	 * @param snackArr
	 */
	private void printArray(Snack[] snackArr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(Snack value : snackArr){
			System.out.println(value);
			System.out.println();
			sum+=value.calcPrice();
		}System.out.printf("총 구매 금액 : %,d원",sum);
		
	}
	
}
