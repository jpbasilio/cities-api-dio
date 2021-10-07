package com.digitalinnovation.citiesapi.countries.repository;

import com.digitalinnovation.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
