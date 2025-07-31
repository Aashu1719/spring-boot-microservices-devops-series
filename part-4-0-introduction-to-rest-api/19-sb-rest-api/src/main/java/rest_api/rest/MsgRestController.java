package rest_api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController
{

    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> getWelcomeMsg(@PathVariable("name") String name)
    {
        String msg = "Welcome to Rest API..!!" + name;
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping("/greet")
    public String getGreetMsg(@RequestParam("name") String name)
    {
        String msg = name + ", Good Morning!!!";
        return msg;
    }

    @GetMapping("/action")
    public ResponseEntity<Void> doAction()
    {
        System.out.println("doAction() matched called");
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
