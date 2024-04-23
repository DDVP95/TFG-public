package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.ArbolTratamientoVO;

public interface ArbolTratamientoServicio {

	<S extends ArbolTratamientoVO> S save(S entity);

	<S extends ArbolTratamientoVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<ArbolTratamientoVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<ArbolTratamientoVO> findAll();

	Iterable<ArbolTratamientoVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(ArbolTratamientoVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends ArbolTratamientoVO> entities);

	void deleteAll();

}