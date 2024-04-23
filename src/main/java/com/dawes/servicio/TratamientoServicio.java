package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.TratamientoVO;

public interface TratamientoServicio {

	<S extends TratamientoVO> S save(S entity);

	<S extends TratamientoVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<TratamientoVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<TratamientoVO> findAll();

	Iterable<TratamientoVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(TratamientoVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends TratamientoVO> entities);

	void deleteAll();

}