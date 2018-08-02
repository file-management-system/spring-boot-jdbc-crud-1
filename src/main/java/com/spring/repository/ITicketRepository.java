package com.spring.repository;

import java.util.List;

import com.spring.model.Ticket;

public interface ITicketRepository {
	
	public int createTicket(Ticket ticket);
	public int updateTicket(Ticket ticket);
	public List<Ticket> selectAll();
	public Ticket selectTicketById(int id);
	public int deleteTicketById(int id);
	public int deleteAllTickets();

}
