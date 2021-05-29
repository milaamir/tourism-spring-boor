package ru.itis.tourismspring.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long stars;

    private Long price;

    private Long days;

    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;
}
