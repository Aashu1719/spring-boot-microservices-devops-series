package MakeMyTripApp.service;

import MakeMyTripApp.bindings.Passanger;
import MakeMyTripApp.bindings.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class MakeMyTripService
{
    public Ticket bookTicket(Passanger p)
    {
        String apiUrl = "http://13.60.208.18:8080/ticket";

        RestTemplate rt = new RestTemplate();
        ResponseEntity<Ticket> forEntity = rt.postForEntity(apiUrl, p, Ticket.class);

        Ticket body = forEntity.getBody();
        return body;
    }


    public List<Ticket> getAllTickets()
    {
        String apiUrl = "http://13.60.208.18:8080/tickets";

        RestTemplate rt = new RestTemplate();

        ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);

        Ticket[] body = forEntity.getBody();

        List<Ticket> tickets = Arrays.asList(body);

        return tickets;

    }

}
