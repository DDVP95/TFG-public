package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.UserRolVO;

public interface UserRolServicio {

	<S extends UserRolVO> S save(S entity);

	<S extends UserRolVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<UserRolVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<UserRolVO> findAll();

	Iterable<UserRolVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(UserRolVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends UserRolVO> entities);

	void deleteAll();

}