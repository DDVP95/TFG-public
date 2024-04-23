package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.UserRolVO;
@Repository
public interface UserRolRepository extends CrudRepository<UserRolVO, Integer> {

}
