package MakeMyTripApp.bindings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket
{
    private Integer ticketNum;
    private String name;
    private String email;
    private String from;
    private String to;
    private String doj;
    private String trainNum;
    private String status;
}
