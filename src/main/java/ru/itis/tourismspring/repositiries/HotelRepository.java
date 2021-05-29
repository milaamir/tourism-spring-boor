package ru.itis.tourismspring.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.tourismspring.models.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
