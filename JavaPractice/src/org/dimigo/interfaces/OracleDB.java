package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *  └OracleDB
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class OracleDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println("Oracle DB 저장");
	}

	@Override
	public void serach() {
		System.out.println("Oracle DB 조회");

	}

	@Override
	public void update() {
		System.out.println("Oracle DB 변경");

	}

	@Override
	public void delete() {
		System.out.println("Oracle DB 삭제");

	}
	

}
