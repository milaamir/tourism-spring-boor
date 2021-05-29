package ru.itis.tourismspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.tourismspring.dto.TourDto;
import ru.itis.tourismspring.models.Country;
import ru.itis.tourismspring.services.CityService;
import ru.itis.tourismspring.services.CountriesService;
import ru.itis.tourismspring.services.TourService;
import ru.itis.tourismspring.sevices.HotelService;

import java.util.List;

@Controller
public class CreateTourController {

    @Autowired
    private TourService tourService;

    @Autowired
    private CountriesService countriesService;

    @Autowired
    private CityService cityService;

    @Autowired
    private HotelService hotelService;

    @GetMapping("/create-tour")
    public String getCreateTourPage(Model model) {
        List<Country> countries = countriesService.getAllCountries();
        model.addAttribute("countries", countries);
        model.addAttribute("hotels", hotelService.getAllHotels());
        //model.addAttribute("cities", cityService.getAllCitiesByTourId())
        return "create-tour";
    }

    @PostMapping("/create-tour")
    public void createTour(TourDto tourDto) {

    }
}
