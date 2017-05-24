package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *  └DBTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		
	
		IDBManager s = IDBManager.getDBObject("SYBASE");
		System.out.println("<< 변경 전 >>");
		DBTest.crud(s);
		System.out.println();
		IDBManager o = IDBManager.getDBObject("ORACLE");
		System.out.println("<< 변경 후 >>");
		DBTest.crud(o);
		
		
	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.serach();
		db.update();
		db.delete();
	}

}
