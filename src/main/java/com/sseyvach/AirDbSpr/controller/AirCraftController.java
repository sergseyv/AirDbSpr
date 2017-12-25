package com.sseyvach.AirDbSpr.controller;

import com.sseyvach.AirDbSpr.model.Aircraft;
import com.sseyvach.AirDbSpr.model.IDBRecord;
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
public class AircraftController {

    private IService service;

    @Autowired(required = true)
    @Qualifier(value = "servBean")
    public void setService(IService service) {
        this.service = service;
    }

    @RequestMapping(value = "aircraftAddShow", method = RequestMethod.GET)
    public String aircraftAddShow(Model model) {
        return jspPage(model, new Aircraft(), "Aircraft", "listAircrafts", "addAircraftPage");
    }

    @RequestMapping(value = "aircraftAddDo", method = RequestMethod.POST)
    public String aircraftAddDo(@ModelAttribute("Aircraft") @Valid Aircraft aircraft, BindingResult bindRes, Model model) {
        return jspAddPage(model, aircraft, bindRes, "Aircraft", "listAircrafts", "addAircraftPage");
    }


    @RequestMapping(value = "aircraftUpdShow", method = RequestMethod.GET)
    public String aircraftUpdShow(Model model) {
        return jspPage(model, new Aircraft(), "Aircraft", "listAircrafts", "updAircraftPage");
    }


    @RequestMapping(value = "aircraftUpdDo", method = RequestMethod.POST)
    public String aircraftUpdDo(@ModelAttribute("Aircraft") @Valid Aircraft aircraft, BindingResult bindRes, Model model) {
        return jspUpdPage(model, aircraft, bindRes, "Aircraft", "listAircrafts", "updAircraftPage");
    }

    @RequestMapping(value = "aircraftDelShow", method = RequestMethod.GET)
    public String aircraftDelShow(Model model) {
        return jspPage(model, new Aircraft(), "Aircraft", "listAircrafts", "delAircraftPage");
    }

    @RequestMapping(value = "aircraftDelDo", method = RequestMethod.POST)
    public String aircraftDelDo(@ModelAttribute("Aircraft") Aircraft aircraft) {
        this.service.remove(aircraft);
        return "redirect:aircraftDelShow";
    }


    public String jspPage(Model model, IDBRecord dbRecord, String recordInJsp ,String listInJsp, String NameOfJspPage) {
        model.addAttribute(recordInJsp, dbRecord);
        model.addAttribute(listInJsp, this.service.listRecords(dbRecord.getClass()));
        return NameOfJspPage;
    }

    public String jspAddPage (Model model, IDBRecord dbRecord, BindingResult bindRes, String recordInJsp ,String listInJsp, String NameOfJspPage){

        if (!bindRes.hasErrors()) {
            this.service.add(dbRecord);

            try {
                dbRecord = dbRecord.getClass().newInstance();
            } catch (InstantiationException|IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return jspPage(model, dbRecord, recordInJsp, listInJsp, NameOfJspPage);
    }

    public String jspUpdPage (Model model, IDBRecord dbRecord, BindingResult bindRes, String recordInJsp ,String listInJsp, String NameOfJspPage){

        if (!bindRes.hasErrors()) {
            this.service.update(dbRecord);

            try {
                dbRecord = dbRecord.getClass().newInstance();
            } catch (InstantiationException|IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return jspPage(model, dbRecord, recordInJsp, listInJsp, NameOfJspPage);
    }


}



