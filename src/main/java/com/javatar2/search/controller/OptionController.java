package com.javatar2.search.controller;

import com.javatar2.search.domain.Options;
import com.javatar2.search.repository.OptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Esmaeil Sadeghi, 6/22/2020 4:38 PM
 */
@RestController
@RequestMapping("option")
public class OptionController {

    @Autowired
    private OptionsRepository optionsRepository;

    @GetMapping
    public ResponseEntity<List<Options>> findOptions() {
        return new ResponseEntity<>(optionsRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Options> searchForCars(Options options) {
        return new ResponseEntity<>(optionsRepository.save(options), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public void remove(@PathVariable("id") int id) {
        optionsRepository.deleteById(id);
    }
}
