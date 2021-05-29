package ru.itis.tourismspring.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import ru.itis.tourismspring.models.Country;
import ru.itis.tourismspring.models.City;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
    private Long id;
    private String name;
    private Country country;

    public static CityDto from(City city) {
        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .country(city.getCountry())
                .build();
    }

    public static List<CityDto> from(List<City> cities) {
        return cities.stream().map(CityDto::from).collect(Collectors.toList());
    }
}