package com.soshinemedia.auth.repository;

import com.soshinemedia.auth.domain.Brand;
import com.soshinemedia.auth.domain.Firm;
import com.soshinemedia.auth.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "firms", collectionResourceRel = "firms", itemResourceRel = "firm")
public interface FirmRepository extends JpaRepository<Firm, Long> {
    //List<Vehicle> findByBrandIn(List<Brand> brandList);
}
