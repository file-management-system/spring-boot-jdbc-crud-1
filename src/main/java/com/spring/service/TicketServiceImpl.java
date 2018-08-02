package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.repository.ITicketRepository;

@Service
public class TicketServiceImpl implements ITicketService {
	@Autowired
	ITicketRepository repository;
}
