package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.TratamientoFincaVO;

@Repository
public interface TratamientoFincaRepository extends CrudRepository<TratamientoFincaVO, Integer> {

}
