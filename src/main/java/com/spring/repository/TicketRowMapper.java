package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper; // this should be the package name of row mapper.mind it.
// dont use java.swing.tree.RowMapper
import com.spring.model.Ticket;

public class TicketRowMapper implements RowMapper<Ticket> {

	@Override
	public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		// UPEER_CASE are the column names in our database.
		Ticket ticket=new Ticket();
		ticket.setTicketId(rs.getInt("TICKET_ID"));
		ticket.setFromCity(rs.getString("FROM_CITY"));
		ticket.setToCity(rs.getString("TO_CITY"));
		ticket.setSeatNum(rs.getInt("SEAT_NUM"));
		return ticket;
	}

}
