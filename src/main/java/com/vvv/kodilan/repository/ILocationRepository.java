package com.vvv.kodilan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvv.kodilan.model.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Long> {

}
