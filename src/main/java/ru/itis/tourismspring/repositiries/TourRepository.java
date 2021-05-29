package ru.itis.tourismspring.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.tourismspring.models.Tour;

import java.util.List;

public interface TourRepository extends JpaRepository<Tour, Long> {

}
