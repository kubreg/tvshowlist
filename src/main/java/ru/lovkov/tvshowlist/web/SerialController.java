package ru.lovkov.tvshowlist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.lovkov.tvshowlist.service.SerialService;

/**
 * Created by kubreg on 13.04.2016.
 */
@Controller
public class SerialController {

    @Autowired
    private SerialService service;

    @RequestMapping(value = "/serials", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("serialList", service.getAll());

        return "serialList";
    }
}
