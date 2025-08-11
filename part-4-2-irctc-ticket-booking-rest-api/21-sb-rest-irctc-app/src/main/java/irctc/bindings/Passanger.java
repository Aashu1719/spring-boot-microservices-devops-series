package irctc.bindings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passanger
{
    private String name;
    private String email;
    private String from;
    private String to;
    private String doj;
    private String trainNum;
}
