package com.spring.utils;

public class QueryBuilder {
	public static final String INSERT = "INSERT INTO TBL_TICKET(TICKET_ID,FROM_CITY,TO_CITY,SEAT_NUM) VALUES (?,?,?,?)";

	public static final String SELECT_BY_ID = "SELECT * FROM TBL_TICKET WHERE ID=?";
	public static final String SELECT_ALL = "SELECT *FROM TBL_TICKET";
	public static final String UPDATE_SOURCE_BY_ID = "UPDATE TBL_TICKET SET FROM_CITY =? WHERE ID=?";
	public static final String UPDATE_SEAT_NUM_BY_ID = "UPDATE TBL_TICKET SET SEAT_NUM=? WHERE ID=?";
	public static final String DELETE_BY_ID = "DELETE FROM TBL_TICKET WHERE TICKET_ID=?";
	public static final String DELETE_ALL = "DELETE FROM TBL_TICKET";

}
