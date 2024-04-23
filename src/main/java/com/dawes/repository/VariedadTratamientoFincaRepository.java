package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.VariedadTratamientoFincaVO;

@Repository
public interface VariedadTratamientoFincaRepository extends CrudRepository<VariedadTratamientoFincaVO, Integer> {

}
