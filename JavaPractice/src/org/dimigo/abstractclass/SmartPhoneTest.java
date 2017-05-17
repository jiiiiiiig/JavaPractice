package org.dimigo.abstractclass;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  └SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones = {
			new IPhone("iPhone 7","애플",900000),	
			new Galaxy("갤럭시 S8","삼성",800000)
		};
		for(SmartPhone tmp : phones){
			System.out.println(tmp);
			tmp.turnOn();
			tmp.pay();
			tmp.useSpecialFunction();
			tmp.turnOff();
			System.out.println();
		}
		
	}
}
