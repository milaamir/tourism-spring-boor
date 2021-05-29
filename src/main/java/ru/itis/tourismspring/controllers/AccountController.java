package ru.itis.tourismspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.tourismspring.models.User;
import ru.itis.tourismspring.security.details.UserDetailsImpl;
import ru.itis.tourismspring.services.SignUpService;
import ru.itis.tourismspring.services.TourService;

@Controller
public class AccountController {

    @Autowired
    private TourService tourService;

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/account")
    public String getProfile(@AuthenticationPrincipal UserDetailsImpl userDetails, Model model) {
        model.addAttribute("tours", tourService.getALlToursByUserId(userDetails.getUser().getId()));
        model.addAttribute("user", signUpService.getUserById(userDetails.getUser().getId()));
        return "account";
    }
}
