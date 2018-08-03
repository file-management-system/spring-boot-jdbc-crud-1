package com.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.model.Ticket;
import com.spring.utils.QueryBuilder;

@Repository

public class TicketRepositoryImpl implements ITicketRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryBuilder.INSERT, ticket.getTicketId(), ticket.getFromCity(), ticket.getToCity(),
				ticket.getSeatNum());
	}

	@Override
	public int updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryBuilder.UPDATE_SEAT_NUM_BY_ID, ticket.getSeatNum(), ticket.getTicketId());
	}

	@Override
	public int deleteTicketById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryBuilder.DELETE_BY_ID, id);// this takes id because we have added ? in the query
																	// so we have to go with this.
		// see its implementation
	}

	@Override
	public int deleteAllTickets() {
		// TODO Auto-generated method stub // INternally java jdbvc used. see thr is
		// Statement inteface
		return jdbcTemplate.update(QueryBuilder.DELETE_ALL);// this doesnt have question mark in the query. so we select
															// update without parameters.
	}

	@Override
	public List<Ticket> selectAll() {
		// TODO Auto-generated method stub
		// RowMapper is an interface, we cannot create object.
		// So we implement that by a class TicketRowMapper and created the object of
		// TicketRowMapper using new
		// As we know parent can hold child object. So here RowMapepr is parent
		// reference and TicketRowMApper is child object
		// So we wrote below line. got it?yes
		RowMapper<Ticket> rowMapper = new TicketRowMapper(); // this is a RowMapper of ticket type.
		// this method exepcts a RowMapper as 3rd parameter. So if you say I wont
		// implement RowMapper then it wont compile.
		// so what the below method wants we have to pass those datatype based values or
		// references.
		return jdbcTemplate.query(QueryBuilder.SELECT_ALL, rowMapper);// I will recomment to use row mapper here // this
																		// doent take id because in query we dont have ?
		// we pased a RowMapper of type Ticket so it retunte a List of type ticket. IT
		// is dynamic hence it mentioned as <T>
		// similary if you pass RowMapper of employee type tghen you will get List of
		// employee type. got it?yes bhai
	}

	@Override
	public Ticket selectTicketById(int id) {
		// TODO Auto-generated method stub
		RowMapper<Ticket> rowMapper = new TicketRowMapper(); // this will do the iteration like we used to in java jdbc
																// with result set.
		return jdbcTemplate.queryForObject(QueryBuilder.SELECT_BY_ID, new Object[] { id }, rowMapper); // this will take
																										// the id
																										// becayuse in
																										// query we have
																										// ?yes

		// so it depends what we have and which method we have to execute. I am an MCA
		// graduate, so I will go for SOftware JObs but I cant do Medical jobs. Corrcet.
		// based on degreee you did the job.

		// similary based on the data you have you have to go for a specfic method. and
		// also klook at the method return type what it returns
	}

	/// I gave references. it doesnt mean you will change the design. I wrote it
	/// should compatible to ur design.

}
