package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.FotografiaVO;

public interface FotografiaServicio {

	<S extends FotografiaVO> S save(S entity);

	<S extends FotografiaVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<FotografiaVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<FotografiaVO> findAll();

	Iterable<FotografiaVO> findAllById(int id);

	long count();

	void deleteById(Integer id);

	void delete(FotografiaVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends FotografiaVO> entities);

	void deleteAll();

}