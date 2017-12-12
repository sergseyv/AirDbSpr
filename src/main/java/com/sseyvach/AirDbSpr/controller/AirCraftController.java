package com.sseyvach.AirDbSpr.controller;

import com.sseyvach.AirDbSpr.model.Aircraft;
import com.sseyvach.AirDbSpr.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;


@Controller
public class AircraftController {

    private IService service;

    @Autowired(required = true)
    @Qualifier(value = "servBean")
    public void setService(IService service) {
        this.service = service;
    }

    @RequestMapping(value = "aircraftAddShow", method = RequestMethod.GET)
    public String aircraftAddShow (Model model) {
        Aircraft aircraft = new Aircraft();
        model.addAttribute ("Aircraft", aircraft);
        model.addAttribute ( "listAircrafts", this.service.listRecords(Aircraft.class) );
        return "addaircraftpage";
    }

    @RequestMapping(value = "aircraftAddDo", method = RequestMethod.POST)
    public String aircraftAddDo (@ModelAttribute("Aircraft") Aircraft aircraft){
        this.service.add(aircraft);
        return "redirect:aircraftAddShow";
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
