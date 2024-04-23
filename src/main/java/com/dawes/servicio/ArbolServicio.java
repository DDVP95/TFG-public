package com.dawes.servicio;

import java.util.List;
import java.util.Optional;

import com.dawes.modelo.ArbolVO;
import com.dawes.modelo.FincaVO;

public interface ArbolServicio {

	boolean existsByFincaAndFilaAndColumna(FincaVO finca, int fila, int columna);

	boolean existsDuplicateArbol(ArbolVO arbol);

	<S extends ArbolVO> S save(S entity);

	<S extends ArbolVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<ArbolVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<ArbolVO> findAll();

	Iterable<ArbolVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(ArbolVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends ArbolVO> entities);

	void deleteAll();

	List<ArbolVO> findByFinca(FincaVO finca);

}