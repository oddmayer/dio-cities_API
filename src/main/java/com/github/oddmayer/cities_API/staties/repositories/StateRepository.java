package com.github.oddmayer.cities_API.staties.repositories;


import com.github.oddmayer.cities_API.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
