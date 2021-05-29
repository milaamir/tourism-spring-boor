package ru.itis.tourismspring.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import ru.itis.tourismspring.models.City;
import ru.itis.tourismspring.models.Country;
import ru.itis.tourismspring.models.Tour;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto {
    private Long id;
    private String name;
    private List<City> cities;
    private List<Tour> tours;

    public static CountryDto from(Country country) {
        return CountryDto.builder()
                .id(country.getId())
                .cities(country.getCities())
                .tours(country.getTours())
                .build();
    }

    public static List<CountryDto> from(List<Country> countries) {
        return countries.stream().map(CountryDto::from).collect(Collectors.toList());
    }
}
