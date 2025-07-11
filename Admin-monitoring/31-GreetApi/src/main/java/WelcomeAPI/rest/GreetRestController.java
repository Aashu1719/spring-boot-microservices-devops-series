package WelcomeAPI.rest;

import WelcomeAPI.client.WelcomeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController
{

    @Autowired
    private WelcomeAPIClient welcomeAPIClient;


    @GetMapping("/greet")
    public String getGreetMsg()
    {
        String welcomeMsg = welcomeAPIClient.invokeWelcomeMsg();

        String greetMsg = "Good morning!";

        return greetMsg.concat(welcomeMsg);
    }
}
