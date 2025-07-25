package Web_mvc.controller;

import Web_mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController
{
    @Autowired
    private ProductService service;

    @GetMapping("/product")
    public String getProductName(Model model)
    {
        String name = service.getName();
        model.addAttribute("msg", name);
        return "index";
    }


}
