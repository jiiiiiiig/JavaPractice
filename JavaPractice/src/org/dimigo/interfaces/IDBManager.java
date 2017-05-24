package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *  └IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";

	void insert();

	void serach();

	void update();

	void delete();

	public static IDBManager getDBObject(String database) {
		IDBManager action = null;
		if (ORACLE_DATABASE.equals(database)) {
			return new OracleDB();
		} else if (SYBASE_DATABASE.equals(database)) {
			return new SybaseDB();
		}

		return action;
	}

}
