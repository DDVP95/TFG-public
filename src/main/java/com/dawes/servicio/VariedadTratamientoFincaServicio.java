package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.VariedadTratamientoFincaVO;

public interface VariedadTratamientoFincaServicio {

	<S extends VariedadTratamientoFincaVO> S save(S entity);

	<S extends VariedadTratamientoFincaVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<VariedadTratamientoFincaVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<VariedadTratamientoFincaVO> findAll();

	Iterable<VariedadTratamientoFincaVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(VariedadTratamientoFincaVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends VariedadTratamientoFincaVO> entities);

	void deleteAll();

}