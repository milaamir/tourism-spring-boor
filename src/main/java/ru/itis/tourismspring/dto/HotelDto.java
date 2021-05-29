package ru.itis.tourismspring.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

import ru.itis.tourismspring.models.Hotel;
import ru.itis.tourismspring.models.Tour;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
    private Long id;
    private String name;
    private Long stars;

    public static HotelDto from(Hotel hotel) {
        return HotelDto.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .stars(hotel.getStars())
                .build();
    }

    public static List<HotelDto> from(List<Hotel> hotels) {
        return hotels.stream().map(HotelDto::from).collect(Collectors.toList());
    }
}
