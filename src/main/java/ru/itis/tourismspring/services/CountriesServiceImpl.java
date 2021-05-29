package ru.itis.tourismspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.tourismspring.models.Country;
import ru.itis.tourismspring.repositiries.CountryRepository;

import java.util.List;

@Service
public class CountriesServiceImpl implements CountriesService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
