package com.javatar2.search.repository;

import com.javatar2.search.domain.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Esmaeil Sadeghi, 6/22/2020 4:39 PM
 */
@RepositoryRestResource
public interface OptionsRepository extends JpaRepository<Options, Integer>, JpaSpecificationExecutor<Options> {
}