package irctc.service;

import irctc.bindings.Passanger;
import irctc.bindings.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class TicketServiceImpl implements TicketService
{

    Map<Integer, Ticket> db= new HashMap<>();

    @Override
    public Ticket bookTicket(Passanger p)
    {
        Ticket t = new Ticket();

        Random r =  new Random();
        int id = r.nextInt(5);
        t.setTicketNum(id);

        BeanUtils.copyProperties(p, t);

        t.setStatus("Confirmed");

        db.put(id, t);

        return t;
    }

    @Override
    public Collection<Ticket> getAllTickets() {
        return db.values();
    }

}
