package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.ArbolTratamientoVO;
@Repository
public interface ArbolTratamientoRepository extends CrudRepository<ArbolTratamientoVO, Integer> {

}
