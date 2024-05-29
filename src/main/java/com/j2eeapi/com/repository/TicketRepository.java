package com.j2eeapi.com.repository;

import com.j2eeapi.com.model.Event;
import com.j2eeapi.com.model.Ticket;
import com.j2eeapi.com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Ticket findDistinctByIdEventAndUtilisateurInscrit(Event event, User utilisateurInscrit);
    //Ticket findByidEvent(Event event);
    //Ticket findByUtilisateurInscrit(User utilisateurInscrit);
}
