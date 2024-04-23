package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.RecoleccionVO;

public interface RecoleccionServicio {

	<S extends RecoleccionVO> S save(S entity);

	<S extends RecoleccionVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<RecoleccionVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<RecoleccionVO> findAll();

	Iterable<RecoleccionVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(RecoleccionVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends RecoleccionVO> entities);

	void deleteAll();

}