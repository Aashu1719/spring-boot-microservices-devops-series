package com.aashu.learn.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements IReortDao
{
    public String getNameById(Integer userId)
    {
        if (userId == 100)
        {
            return "John";
        } else if (userId == 101)
        {
            return "Smith";
        }

        else
        {
            return "Name not found";
        }
    }
}
