package org.dimigo.basic;

/**
 * <pre>
 *  org.dimigo.basic
 *  └Operator
 * 
 * 1. 개요 :        
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 디미베네 연간 인건비 >>");
		int salary = 1700000;
		int employee = 3;
		int market = 1500;
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", employee) +"명");
		System.out.println("점포 수 : " + String.format("%,d", market) +"개");
		System.out.println("연간 인건비 : " + String.format("%,d", (long)salary*12*employee*market) +"원");
		
		
	}

}
