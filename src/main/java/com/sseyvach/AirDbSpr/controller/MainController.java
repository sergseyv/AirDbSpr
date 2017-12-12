package com.sseyvach.AirDbSpr.controller;

import com.sseyvach.AirDbSpr.model.Aircraft;
import com.sseyvach.AirDbSpr.model.Company;
import com.sseyvach.AirDbSpr.model.Ownership;

import com.sseyvach.AirDbSpr.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class MainController {

    private IService service;

    @Autowired (required = true)
    @Qualifier (value = "servBean")
    public void setService(IService service) {
        this.service = service;
    }

    @RequestMapping (value = "mainPageShow")
    public String listAllRecords(Model model) {
        model.addAttribute ( "listAircrafts", this.service.listRecords(Aircraft.class) );
        model.addAttribute ( "listCompanies", this.service.listRecords(Company.class) );
        model.addAttribute ( "listOwnerships", this.service.listRecords(Ownership.class) );
        return "mainpage";
    }

}
