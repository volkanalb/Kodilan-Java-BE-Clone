package com.vvv.kodilan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvv.kodilan.model.Tag;

@Repository
public interface ITagRepository extends JpaRepository<Tag, Long> {

}
