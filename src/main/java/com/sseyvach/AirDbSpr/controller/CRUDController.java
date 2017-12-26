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
public class CRUDController {

/* =============================== Инициализация  =============================== */

    private IService service;

    @Autowired(required = true)
    @Qualifier(value = "servBean")
    public void setService(IService service) {
        this.service = service;
    }


/* =============================== Вспомогательные методы  =============================== */

    public String jspPage ( Model model, IDBRecord dbRecord,
                            String recordInJsp, String listInJsp, String NameOfJspPage ) {
        model.addAttribute(recordInJsp, dbRecord);
        model.addAttribute(listInJsp, this.service.listRecords(dbRecord.getClass()));
        return NameOfJspPage;
    }


    public String jspPageAction ( Model model, IDBRecord dbRecord, boolean bindResHasErrors,
                                  String recordInJsp, String listInJsp, String NameOfJspPage, IMethod method ){

        System.out.println(bindResHasErrors);
        System.out.println(dbRecord);

        if ( !bindResHasErrors ) {
            method.action(dbRecord);
            try {
                dbRecord = dbRecord.getClass().newInstance();
            } catch (InstantiationException|IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return jspPage(model, dbRecord, recordInJsp, listInJsp, NameOfJspPage);
    }


/* =============================== Aircraft controller  =============================== */

    /* ------------- add  ------------- */

    @RequestMapping(value = "aircraftAddShow", method = RequestMethod.GET)
    public String aircraftAddShow(Model model) {
        return jspPage(model, new Aircraft(), "Aircraft", "listAircrafts", "addAircraftPage");
    }
    @RequestMapping(value = "aircraftAddAction", method = RequestMethod.POST)
    public String aircraftAddAction(@ModelAttribute("Aircraft") @Valid Aircraft aircraft, BindingResult bindRes, Model model) {
        return jspPageAction(model, aircraft, bindRes.hasErrors(), "Aircraft", "listAircrafts", "addAircraftPage", this.service::add);
    }

    /* ------------- upd  ------------- */

    @RequestMapping(value = "aircraftUpdShow", method = RequestMethod.GET)
    public String aircraftUpdShow(Model model) {
        return jspPage(model, new Aircraft(), "Aircraft", "listAircrafts", "updAircraftPage");
    }
    @RequestMapping(value = "aircraftUpdAction", method = RequestMethod.POST)
    public String aircraftUpdAction(@ModelAttribute("Aircraft") @Valid Aircraft aircraft, BindingResult bindRes, Model model) {
        return jspPageAction(model, aircraft, bindRes.hasErrors(), "Aircraft", "listAircrafts", "updAircraftPage", this.service::update);
    }

    /* ------------- del  ------------- */

    @RequestMapping(value = "aircraftDelShow", method = RequestMethod.GET)
    public String aircraftDelShow(Model model) {
        return jspPage(model, new Aircraft(), "Aircraft", "listAircrafts", "delAircraftPage");
    }
    @RequestMapping(value = "aircraftDelAction", method = RequestMethod.POST)
    public String aircraftDelAction(@ModelAttribute("Aircraft") Aircraft aircraft, Model model) {
        return jspPageAction(model, aircraft, false, "Aircraft", "listAircrafts", "delAircraftPage", this.service::remove);
    }

    /* ------------- view  ------------- */

    @RequestMapping(value = "aircraftViewShow", method = RequestMethod.GET)
    public String aircraftViewShow(Model model) {
        return jspPage(model, new Aircraft(), "Aircraft", "listAircrafts", "viewAircraftPage");
    }
    @RequestMapping(value = "aircraftViewAction", method = RequestMethod.POST)
    public String aircraftViewAction(@ModelAttribute("Aircraft") Aircraft aircraft, Model model) {
        return jspPageAction2(model, aircraft.getClass(), aircraft.getAircraftId(), "Aircraft", "listAircrafts", "viewAircraftPage");
    }


    public String jspPageAction2 ( Model model, Class clazz, int id,
                                  String recordInJsp, String listInJsp, String NameOfJspPage ){

        IDBRecord dbRecord = this.service.getById(clazz, id);
        return jspPage(model, dbRecord, recordInJsp, listInJsp, NameOfJspPage);
    }


/* =============================== Company controller  =============================== */



}

