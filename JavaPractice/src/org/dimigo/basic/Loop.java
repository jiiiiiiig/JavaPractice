package org.dimigo.basic;

import java.util.*;

/**
 * <pre>
 *  org.dimigo.basic
 *  └Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice;
		int str = 100;
		String[] job = {"마법사","영주","기사","농민"};

		do {
			System.out.println("---------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("---------------");
			System.out.print("메뉴 입력 => ");

			choice = in.nextInt();

			switch (choice) {
			case 1:
				str +=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + str);
				break;
			case 2:
				str -=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + (str));
				break;
			case 3:
				int random = new Random().nextInt(4);
				System.out.println(job[random]+"(으)로 설정되었습니다.");
				break;
			default:
				
			}

		} while (choice != 9);

		System.out.println("이제 공부하세요!");

	}

}
