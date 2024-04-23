package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.VariedadVO;

@Repository
public interface VariedadRepository extends CrudRepository<VariedadVO, Integer> {

}
