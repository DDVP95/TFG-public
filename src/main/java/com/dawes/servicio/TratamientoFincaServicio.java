package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.TratamientoFincaVO;

public interface TratamientoFincaServicio {

	<S extends TratamientoFincaVO> S save(S entity);

	<S extends TratamientoFincaVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<TratamientoFincaVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<TratamientoFincaVO> findAll();

	Iterable<TratamientoFincaVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(TratamientoFincaVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends TratamientoFincaVO> entities);

	void deleteAll();

}