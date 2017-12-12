package com.sseyvach.AirDbSpr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {



    @RequestMapping(value = "aircraftupd", method = RequestMethod.GET)
    public String aircraftupd (Model model) { return "updaircraft"; }

    @RequestMapping(value = "aircraftdel", method = RequestMethod.GET)
    public String aircraftdel (Model model) { return "delaircraft"; }


    @RequestMapping(value = "companyadd", method = RequestMethod.GET)
    public String companyadd (Model model) { return "addcompany"; }

    @RequestMapping(value = "companyupd", method = RequestMethod.GET)
    public String companyupd (Model model) { return "updcompany"; }

    @RequestMapping(value = "companydel", method = RequestMethod.GET)
    public String companydel (Model model) { return "delcompany"; }


    @RequestMapping(value = "ownershipadd", method = RequestMethod.GET)
    public String ownershipadd (Model model) { return "addownership"; }

    @RequestMapping(value = "ownershipupd", method = RequestMethod.GET)
    public String ownershipupd (Model model) { return "updownership"; }

    @RequestMapping(value = "ownershipdel", method = RequestMethod.GET)
    public String ownershipdel (Model model) { return "delownership"; }

}
