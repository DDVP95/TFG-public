package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.ReposicionVO;

@Repository
public interface ReposicionRepository extends CrudRepository<ReposicionVO, Integer> {

}
