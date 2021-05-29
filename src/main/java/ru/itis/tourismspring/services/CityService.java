package ru.itis.tourismspring.services;

import ru.itis.tourismspring.models.City;

import java.util.List;

public interface CityService {
    List<City> getAllCitiesByTourId(long tourId);
}
