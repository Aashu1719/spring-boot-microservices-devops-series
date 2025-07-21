package Web_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/c2")
public class UserController
{
    public UserController()
    {
        System.out.println("WelcomeController : Constructor");
    }

    @GetMapping("/user")
    public ModelAndView getUser()
    {

        ModelAndView mav = new ModelAndView();

        mav.addObject("id", 101);
        mav.addObject("name", "Aashu");
        mav.addObject("email", "aashu@gmail.com");

        mav.setViewName("user");
        return mav;
    }

}
