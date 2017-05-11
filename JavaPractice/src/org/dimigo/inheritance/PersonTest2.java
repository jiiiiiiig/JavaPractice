package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  └PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Tom");
		Person k = new Korean("홍길동");
		Person j = new Japanese("다나카");
		Person c = new Chinese("왕밍");
		
		PersonTest2.greeting(p);
		PersonTest2.greeting(k);
		PersonTest2.greeting(j);
		PersonTest2.greeting(c);
		
	}

	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
	
}
