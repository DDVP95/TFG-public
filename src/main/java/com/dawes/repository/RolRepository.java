package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.RolVO;
@Repository
public interface RolRepository extends CrudRepository<RolVO, Integer> {

}
