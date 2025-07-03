package com.aashu.learn;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Engiene
{
    public Engiene()
    {
        System.out.println("Engiene :: Constructor");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("This is inti method");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("This is destroy method");
    }
}
