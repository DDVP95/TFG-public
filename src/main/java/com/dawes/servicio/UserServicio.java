package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.UserVO;

public interface UserServicio {

	<S extends UserVO> S save(S entity);

	<S extends UserVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<UserVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<UserVO> findAll();

	Iterable<UserVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(UserVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends UserVO> entities);

	void deleteAll();

	Optional<UserVO> findByUsername(String username);

}