package com.sseyvach.AirDbSpr.controller;

import com.sseyvach.AirDbSpr.model.Aircraft;
import com.sseyvach.AirDbSpr.model.Company;
import com.sseyvach.AirDbSpr.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import javax.validation.Valid;


@Controller
public class CompanyController {

    private IService service;

    @Autowired(required = true)
    @Qualifier(value = "servBean")
    public void setService(IService service) {
        this.service = service;
    }


/* ===================================== Add company  ===========================================    */

    @RequestMapping(value = "companyAddShow", method = RequestMethod.GET)
    public String companyAddShow(Model model) {
        Company company = new Company();
        model.addAttribute("Company", company);
        model.addAttribute("listCompanies", this.service.listRecords(Company.class));
        return "addCompanyPage";
    }
/*
    @RequestMapping(value = "aircraftAddDo", method = RequestMethod.POST)
    public String aircraftAddDo(@ModelAttribute("Aircraft") @Valid Aircraft aircraft, BindingResult bindRes, Model model) {
        if (bindRes.hasErrors()) {
            model.addAttribute("Aircraft", aircraft);
            model.addAttribute("listAircrafts", this.service.listRecords(Aircraft.class));
            return "addAircraftPage";
        } else {
            this.service.add(aircraft);
            return "redirect:aircraftAddShow";
        }
    }


/* ===================================== Update aircraft  ===========================================    */
/*
    @RequestMapping(value = "aircraftUpdShow", method = RequestMethod.GET)
    public String aircraftUpdShow(Model model) {
        Aircraft aircraft = new Aircraft();
        model.addAttribute("Aircraft", aircraft);
        model.addAttribute("listAircrafts", this.service.listRecords(Aircraft.class));
        return "updAircraftPage";
    }

    @RequestMapping(value = "aircraftUpdDo", method = RequestMethod.POST)
    public String aircraftUpdDo(@ModelAttribute("Aircraft") @Valid Aircraft aircraft, BindingResult bindRes, Model model) {
        if (bindRes.hasErrors()) {
            model.addAttribute("Aircraft", aircraft);
            model.addAttribute("listAircrafts", this.service.listRecords(Aircraft.class));
            return "updAircraftPage";
        } else {
            this.service.update(aircraft);
            return "redirect:aircraftUpdShow";
        }
    }


    /* ===================================== Delete aircraft  ===========================================    */
/*
    @RequestMapping(value = "aircraftDelShow", method = RequestMethod.GET)
    public String aircraftDelShow(Model model) {
        Aircraft aircraft = new Aircraft();
        model.addAttribute("Aircraft", aircraft);
        model.addAttribute("listAircrafts", this.service.listRecords(Aircraft.class));
        return "delAircraftPage";
    }

    @RequestMapping(value = "aircraftDelDo", method = RequestMethod.POST)
    public String aircraftDelDo(@ModelAttribute("Aircraft") Aircraft aircraft) {
        this.service.remove(aircraft.getClass(), aircraft.getAircraftId());
        return "redirect:aircraftDelShow";
    }

    */
}



