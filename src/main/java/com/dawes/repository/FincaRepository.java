package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.FincaVO;

@Repository
public interface FincaRepository extends CrudRepository<FincaVO, Integer> {

	
	
	
}
