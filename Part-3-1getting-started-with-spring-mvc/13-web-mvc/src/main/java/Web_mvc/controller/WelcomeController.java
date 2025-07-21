package Web_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/c1")
public class WelcomeController
{
    public WelcomeController()
    {
        System.out.println("WelcomeController : Constructor");
    }

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg()
    {
        System.out.println("getWelcomeMsg() - method executed...");

        ModelAndView mav = new ModelAndView();

        mav.addObject("msg1", "Welcome to Ashok It");
        mav.addObject("msg2", "Good morning...");

        mav.setViewName("index");
        return mav;
    }


    @GetMapping("/date")
    public ModelAndView getDate()
    {
        ModelAndView mav = new ModelAndView();
        mav.addObject("date", new Date());

        mav.setViewName("index");

        return mav;
    }
}
