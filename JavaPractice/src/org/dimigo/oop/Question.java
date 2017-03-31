package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  └Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
import java.util.Scanner;

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] que = { "1.가장 좋아하는 가수는?", "2.가장 좋아하는 배우는?", "3.가장 좋아하는 과목은?" };
		String[] ans = { "아리아나", "이성경", "물리" };

		for (int i = 0; i < que.length; i++) {
			System.out.println(que[i]);
			String answer = scan.nextLine();
			if (answer.equals(ans[i]))
				System.out.println("정답입니다!");
			else
				System.out.println("틀렸습니다!");

		}
		
		StringBuilder res = new StringBuilder("<<결과 출력>>\n");
		for(int i=0;i<que.length;i++){
		res.append(que[i]).append(" ").append(ans[i]).append("입니다.\n");
		}
		System.out.println(res);
	}
}
