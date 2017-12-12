package com.sseyvach.AirDbSpr.controller;

import com.sseyvach.AirDbSpr.model.Aircraft;
import com.sseyvach.AirDbSpr.model.Company;
import com.sseyvach.AirDbSpr.model.Ownership;

import com.sseyvach.AirDbSpr.service.IService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;


@Controller
public class MainController {

    private IService service;

    @Autowired (required = true)
    @Qualifier (value = "servBean")
    public void setService(IService service) {
        this.service = service;
    }

    @RequestMapping (value = "mainpage", method = RequestMethod.GET)
    public String listAllRecords(Model model) {
        model.addAttribute ( "listAircrafts", this.service.listRecords(Aircraft.class) );
        model.addAttribute ( "listCompanies", this.service.listRecords(Company.class) );
        model.addAttribute ( "listOwnerships", this.service.listRecords(Ownership.class) );
        return "mainpage";
    }



    @RequestMapping(value = "aircraftadd", method = RequestMethod.GET)
    public String aircraftadd (Model model) {
        Aircraft aircraft = new Aircraft();
        model.addAttribute ("addAirc", aircraft);
        model.addAttribute ( "listAircrafts", this.service.listRecords(Aircraft.class) );
        return "addaircraft";
    }

    @RequestMapping(value = "aircraftadd", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("addAirc") Aircraft aircraft){
        this.service.add(aircraft);
        return "redirect:aircraftadd";
    }





 /*   @RequestMapping (value = "addaircraft", method = RequestMethod.GET)
    public String addAir ( @ModelAttributye("air") Aircraft aircraft ) {
        if ( aircraft.getAircraftId() == 0 ) {
            this.airServ.addAir(aircraft);
        } else {
            this.airServ.updateAir(aircraft);
        }
        return "redirect:/mainpage";
    }*/




    /*

    @RequestMapping("/remove/{id}")
    public String removeAir(@PathVariable("id") int id){
        this.airServ.removeAir(id);
        return "redirect:/mainpage";
    }

    /*
    @RequestMapping (value = "/mainpage/add", method = RequestMethod.POST)
    public String addAir ( @ModelAttribute("air") Aircraft aircraft ) {
         if ( aircraft.getAircraftId() == 0 ) {
             this.airServ.addAir(aircraft);
         } else {
             this.airServ.updateAir(aircraft);
         }
        return "redirect:/mainpage";
    }*/


    /*
        @RequestMapping("edit/{id}")
        public String editAir(@PathVariable("id") int id, Model model){
            model.addAttribute("aircraft", this.airServ.getAirById(id));
            model.addAttribute("listAircrafts", this.airServ.listRecords());

            return "mainpage";
        }

    @RequestMapping("airdata/{id}")
    public String airData(@PathVariable("id") int id, Model model){
        model.addAttribute("aircraft", this.airServ.getAirById(id));
        return "airdata";
    }*/


}
