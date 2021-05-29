package ru.itis.tourismspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.tourismspring.dto.UserForm;
import ru.itis.tourismspring.services.SignUpService;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;
import java.util.Objects;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }
   /* @PostMapping("/signUp")
    public String signUp(UserForm form) {
        signUpService.signUp(form);
        return "redirect:/signUp";
    }

    */
    @PermitAll
   @PostMapping("/signUp")
   public String signUp(@Valid UserForm form, BindingResult bindingResult, Model model) {
       if (bindingResult.hasErrors()) {
           bindingResult.getAllErrors().stream().anyMatch(error -> {
               if (Objects.requireNonNull(error.getCodes())[0].equals("userSignUpForm.ValidNames")) {
                   model.addAttribute("namesErrorMessage", error.getDefaultMessage());
               }
               return true;
           });
           model.addAttribute("userSignUpForm", form);
       } else {
           signUpService.signUp(form);
           return "redirect:signIn";
       }
       return "signUp";
   }

}
