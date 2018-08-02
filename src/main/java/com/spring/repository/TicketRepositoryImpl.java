package com.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Ticket;

@Repository

public class TicketRepositoryImpl implements ITicketRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Ticket> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket selectTicketById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTicketById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAllTickets() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
