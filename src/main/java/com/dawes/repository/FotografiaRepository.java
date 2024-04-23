package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.FotografiaVO;
@Repository
public interface FotografiaRepository extends CrudRepository<FotografiaVO, Integer> {

}
