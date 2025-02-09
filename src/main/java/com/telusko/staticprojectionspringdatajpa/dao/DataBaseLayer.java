package com.telusko.staticprojectionspringdatajpa.dao;

import com.telusko.staticprojectionspringdatajpa.ResultView.ResultViewPage;
import com.telusko.staticprojectionspringdatajpa.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataBaseLayer extends JpaRepository<StudentInfo, Integer>
{
    public List<ResultViewPage> findByRegIdLessThan(int regId);
}
