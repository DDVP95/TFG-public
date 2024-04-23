package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.TratamientoVO;

@Repository
public interface TratamientoRepository extends CrudRepository<TratamientoVO, Integer> {

}
