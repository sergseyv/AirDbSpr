package com.sseyvach.AirDbSpr.controller;

import com.sseyvach.AirDbSpr.service.AirServ;
import com.sseyvach.AirDbSpr.service.ComServ;
import com.sseyvach.AirDbSpr.service.OwnServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private AirServ airServ;
    private ComServ comServ;
    private OwnServ ownServ;

    @Autowired (required = true)
    @Qualifier (value = "airServ")
    public void setAirServ(AirServ airServ) {
        this.airServ = airServ;
    }

    @Autowired (required = true)
    @Qualifier (value = "comServ")
    public void setComServ(ComServ comServ) {
        this.comServ = comServ;
    }

    @Autowired (required = true)
    @Qualifier (value = "ownServ")
    public void setOwnServ(OwnServ ownServ) {
        this.ownServ = ownServ;
    }


    @RequestMapping (value = "mainpage", method = RequestMethod.GET)
    public String listAirs (Model model) {
        model.addAttribute("listAircrafts", this.airServ.listAirs());
        model.addAttribute("listCompanies", this.comServ.listComs());
        model.addAttribute("listOwnerships", this.ownServ.listOwns());
        return "mainpage";
    }

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
            model.addAttribute("listAircrafts", this.airServ.listAirs());

            return "mainpage";
        }

    @RequestMapping("airdata/{id}")
    public String airData(@PathVariable("id") int id, Model model){
        model.addAttribute("aircraft", this.airServ.getAirById(id));
        return "airdata";
    }*/


}
