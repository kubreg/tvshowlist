package ru.lovkov.tvshowlist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.lovkov.tvshowlist.LoggedUser;
import ru.lovkov.tvshowlist.service.UserSerialService;

/**
 * Created by kubreg on 13.04.2016.
 */
@Controller
public class UserSerialController {

    @Autowired
    private UserSerialService service;

    @RequestMapping(value = "/userSerials", method = RequestMethod.GET)
    public String getDefaultList(Model model) {
        model.addAttribute("userSerialList", service.getDefaultList(LoggedUser.id()));

        return "userSerialList";
    }
}
