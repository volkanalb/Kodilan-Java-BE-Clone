package com.vvv.kodilan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvv.kodilan.model.Tag;

public interface IPostRepository extends JpaRepository<Tag, Long>  {

}
