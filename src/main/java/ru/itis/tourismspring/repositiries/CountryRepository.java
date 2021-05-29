package ru.itis.tourismspring.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.tourismspring.models.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
