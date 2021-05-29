package ru.itis.tourismspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.tourismspring.models.City;
import ru.itis.tourismspring.models.Country;
import ru.itis.tourismspring.models.Tour;
import ru.itis.tourismspring.services.CityService;
import ru.itis.tourismspring.services.TourService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ToursController {

    @Autowired
    private TourService tourService;

    @GetMapping("/tours")
    public String getAllToursPage(Model model){
        List<City> cities = new ArrayList<>();
        List<Tour> tours = tourService.getALlTours();
        List<Country> countries = new ArrayList<>();
        for (Tour tour: tours) {
            countries.addAll(tour.getCountries());
            for (Country country : countries) {
                cities.addAll(country.getCities());
            }
        }
        model.addAttribute("tours", tourService.getALlTours());
        model.addAttribute("countries", countries);
        model.addAttribute("cities", cities);
        return "tours";
    }
}
