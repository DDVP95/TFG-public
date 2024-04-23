package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.RecoleccionVO;
@Repository
public interface RecoleccionRepository extends CrudRepository<RecoleccionVO, Integer> {

}
