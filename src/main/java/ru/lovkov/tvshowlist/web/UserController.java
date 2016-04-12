package ru.lovkov.tvshowlist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.lovkov.tvshowlist.LoggedUser;
import ru.lovkov.tvshowlist.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kubreg on 12.04.2016.
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("userList", service.getAll());

        return "userList";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String setUser(HttpServletRequest request) {
        int userId = Integer.valueOf(request.getParameter("userId"));
        LoggedUser.setId(userId);
        return "redirect:userSerials";
    }
}
