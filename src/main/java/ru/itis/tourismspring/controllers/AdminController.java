package ru.itis.tourismspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.tourismspring.services.UsersService;

@Controller
public class AdminController {

    @Autowired
    private UsersService usersService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/admin")
    public String getAccountPage(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "admin_page";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/ban/{id}", method = RequestMethod.POST)
    public String banUser(@PathVariable Long id) {
        usersService.banById(id);
        return "redirect:/admin";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/unban/{id}", method = RequestMethod.POST)
    public String unbanUser(@PathVariable Long id) {
        usersService.unbanById(id);
        return "redirect:/admin";
    }
}
