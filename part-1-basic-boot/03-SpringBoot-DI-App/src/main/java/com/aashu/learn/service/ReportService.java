package com.aashu.learn.service;

import com.aashu.learn.dao.IReortDao;
import com.aashu.learn.dao.ReportDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService
{

//    @Autowired
    private IReortDao reportDaoImpl;

    public ReportService()
    {
        System.out.println("No arg constructor");
    }

    @Autowired
    public void setReportDaoImpl(IReortDao reportDaoImpl)
    {
            System.out.println("Setter method called");
        this.reportDaoImpl = reportDaoImpl;
    }

    @Autowired
    public ReportService(ReportDaoImpl reportDaoImpl)
    {
        System.out.println("Param - Constructor");
        this.reportDaoImpl = reportDaoImpl;
    }


    public void printName(Integer userId)
    {
        String nameById = reportDaoImpl.getNameById(userId);
        System.out.println(nameById);
    }
}
