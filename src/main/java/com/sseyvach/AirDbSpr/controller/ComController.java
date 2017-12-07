package com.sseyvach.AirDbSpr.controller;

import com.sseyvach.AirDbSpr.model.Company;
import com.sseyvach.AirDbSpr.service.ComServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComController {

    private ComServ comServ;

    @Autowired (required = true)
    @Qualifier (value = "comServ")
    public void setComServ(ComServ comServ) {
        this.comServ = comServ;
    }

    @RequestMapping (value = "mainpage", method = RequestMethod.GET)
    public String listComs (Model model) {
        model.addAttribute("company", new Company());
        model.addAttribute("listComs222", this.comServ.listComs());
        return "mainpage";
    }

    @RequestMapping (value = "/mainpage/add", method = RequestMethod.POST)
    public String addCom ( @ModelAttribute("com") Company company ) {
        if ( company.getCompanyId() == 0 ) {
            this.comServ.addCom(company);
        } else {
            this.comServ.updateCom(company);
        }
        return "redirect:/mainpage";
    }

    @RequestMapping("/remove/{id}")
    public String removeCom(@PathVariable("id") int id){
        this.comServ.removeCom(id);
        return "redirect:/mainpage";
    }

    @RequestMapping("edit/{id}")
    public String editCom(@PathVariable("id") int id, Model model){
        model.addAttribute("company", this.comServ.getComById(id));
        model.addAttribute("listComs222", this.comServ.listComs());

        return "mainpage";
    }

    @RequestMapping("comdata/{id}")
    public String comData(@PathVariable("id") int id, Model model){
        model.addAttribute("company", this.comServ.getComById(id));
        return "comdata";
    }


}
