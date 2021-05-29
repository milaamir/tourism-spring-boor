package ru.itis.tourismspring.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

import ru.itis.tourismspring.models.Country;
import ru.itis.tourismspring.models.City;
import ru.itis.tourismspring.models.Hotel;
import ru.itis.tourismspring.models.Tour;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TourDto {
    private String name;
    private List<String> countries;
    private List<City> cities;
    private List<Hotel> hotels;

    public static TourDto from(Tour tour) {
        return TourDto.builder()
                .name(tour.getName())
                .build();
    }

    public static List<TourDto> from(List<Tour> tours) {
        return tours.stream().map(TourDto::from).collect(Collectors.toList());
    }
}
