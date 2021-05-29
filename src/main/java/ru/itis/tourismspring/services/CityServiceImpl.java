package ru.itis.tourismspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.tourismspring.models.City;
//import ru.itis.tourismspring.repositiries.CityRepository;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    //@Autowired
    //private CityRepository cityRepository;

    @Override
    public List<City> getAllCitiesByTourId(long tourId) {
        //return cityRepository.findAllByTourId(tourId);
        return null;
    }
}
