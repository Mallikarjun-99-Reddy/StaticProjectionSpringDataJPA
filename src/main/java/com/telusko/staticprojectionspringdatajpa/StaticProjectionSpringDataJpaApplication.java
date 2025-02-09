package com.telusko.staticprojectionspringdatajpa;

import com.telusko.staticprojectionspringdatajpa.service.ServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StaticProjectionSpringDataJpaApplication {

    public static void main(String[] args)
    {
        ApplicationContext container = SpringApplication.run(StaticProjectionSpringDataJpaApplication.class, args);
        ServiceImplementation service = container.getBean(ServiceImplementation.class);
        service.fetchByRegIdLessThan(132313223).forEach((s)-> System.out.println(s.getName() + " " + s.getUniversity()));
    }

}
