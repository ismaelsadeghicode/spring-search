package com.javatar2.search.controller;

import com.javatar2.search.domain.Car;
import com.javatar2.search.repository.CarRepository;
import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Esmaeil Sadeghi, 6/22/2020 11:41 AM
 */
@Controller
public class CarController {
    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> searchForCars(@SearchSpec Specification<Car> specs) {
        return new ResponseEntity<>(carRepository.findAll(Specification.where(specs)), HttpStatus.OK);
    }
}