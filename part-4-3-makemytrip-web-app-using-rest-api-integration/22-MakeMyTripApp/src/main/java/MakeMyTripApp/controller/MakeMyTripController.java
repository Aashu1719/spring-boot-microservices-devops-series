package MakeMyTripApp.controller;

import MakeMyTripApp.bindings.Passanger;
import MakeMyTripApp.bindings.Ticket;
import MakeMyTripApp.service.MakeMyTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MakeMyTripController
{
    @Autowired
    private MakeMyTripService makeMyTripService;

    @PostMapping("/ticket")
    public String ticketBooking(Passanger p, Model model) {
        Ticket bookticket = makeMyTripService.bookTicket(p);
        model.addAttribute("msg", "Your Ticket Booked");
        model.addAttribute("p", p); // Ensure 'p' is passed back to Thymeleaf
        return "bookTicket";
    }

    @GetMapping("/bookTicket")
    public String bookTicket(Model model)
    {
        model.addAttribute("p", new Passanger());
        return "bookTicket";
    }

    @GetMapping("/getTicket")
    public String index(Model model)
    {
        List<Ticket> allTickets = makeMyTripService.getAllTickets();

        model.addAttribute("tickets", allTickets);

        return "index";
    }
}
