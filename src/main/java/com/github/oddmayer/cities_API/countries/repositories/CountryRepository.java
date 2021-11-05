package com.github.oddmayer.cities_API.countries.repositories;

import com.github.oddmayer.cities_API.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}