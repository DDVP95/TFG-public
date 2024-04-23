package com.dawes.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.UserVO;
@Repository
public interface UserRepository extends CrudRepository<UserVO, Integer> {

	Optional<UserVO> findByUsername(String username);

}
