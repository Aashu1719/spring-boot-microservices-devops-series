package Web_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController
{

    @GetMapping("/welcome")
    public String getWelcomeMsg(Model model)
    {
        model.addAttribute("msg", "Welcome to Ashok It...!!");
        int i = 1/0;
        return "index";
    }

    @GetMapping("/greet")
    public String getGreetMsg(Model model)
    {
        model.addAttribute("msg", "Good Morning");
        return "index";
    }
}
