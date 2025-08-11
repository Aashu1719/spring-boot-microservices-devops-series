package irctc.service;

import irctc.bindings.Passanger;
import irctc.bindings.Ticket;

import java.util.Collection;

public interface TicketService
{
    public Ticket bookTicket(Passanger p);

    public Collection<Ticket> getAllTickets();
}
