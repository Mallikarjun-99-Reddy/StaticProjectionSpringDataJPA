package com.telusko.staticprojectionspringdatajpa.service;

import com.telusko.staticprojectionspringdatajpa.ResultView.ResultViewPage;
import com.telusko.staticprojectionspringdatajpa.dao.DataBaseLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements ServiceLayer
{
    @Autowired
    private DataBaseLayer db;

    @Override
    public List<ResultViewPage> fetchByRegIdLessThan(int regId) {
        return db.findByRegIdLessThan(regId);
    }
}
