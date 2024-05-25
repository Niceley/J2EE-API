package com.j2eeapi.com.service;

import com.j2eeapi.com.dto.CreateTicketDto;
import com.j2eeapi.com.dto.UpdateTicketDto;
import com.j2eeapi.com.model.Ticket;
import com.j2eeapi.com.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public ResponseEntity<Ticket> createTicket(CreateTicketDto CreateTicketDto) {
        Ticket ticket = new Ticket(CreateTicketDto.getId(),
                CreateTicketDto.getPrice(),
                CreateTicketDto.getIdEvent(),
                CreateTicketDto.getIdOrder(),
                CreateTicketDto.getUtilisateurInscrit());
        ticket = ticketRepository.save(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }

    public ResponseEntity<Ticket> getTicket(Long id) {
        Optional<Ticket> ticket = this.ticketRepository.findById(id);
        return ticket.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = this.ticketRepository.findAll();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    public ResponseEntity<Ticket> updateTicket(Long idTicket, UpdateTicketDto UpdateTicketDto) {
        Ticket ticket = this.ticketRepository.findById(idTicket).orElseThrow( ()
                -> new RuntimeException("Ticket introuvable"));

        ticket.setPrice(UpdateTicketDto.getPrice());
        ticket.setIdEvent(UpdateTicketDto.getIdEvent());
        ticket.setIdOrder(UpdateTicketDto.getIdOrder());
        ticket.setUtilisateurInscrit(UpdateTicketDto.getUtilisateurInscrit());
        ticket = this.ticketRepository.save(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteTicket(Long id) {
        this.ticketRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}