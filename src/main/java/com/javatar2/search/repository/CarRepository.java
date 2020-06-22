package com.javatar2.search.repository;


import com.javatar2.search.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Esmaeil Sadeghi, 6/22/2020 11:41 AM
 */
@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Integer>, JpaSpecificationExecutor<Car> {
}