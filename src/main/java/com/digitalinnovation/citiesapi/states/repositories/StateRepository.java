package com.digitalinnovation.citiesapi.states.repositories;

import com.digitalinnovation.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
