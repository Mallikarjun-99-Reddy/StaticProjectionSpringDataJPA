package com.telusko.staticprojectionspringdatajpa.service;

import com.telusko.staticprojectionspringdatajpa.ResultView.ResultViewPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceLayer
{
    public List<ResultViewPage> fetchByRegIdLessThan(int regId);
}
