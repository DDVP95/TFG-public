package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.FincaVO;

public interface FincaServicio {

	<S extends FincaVO> S save(S entity);

	<S extends FincaVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<FincaVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<FincaVO> findAll();

	Iterable<FincaVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(FincaVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends FincaVO> entities);

	void deleteAll();

}