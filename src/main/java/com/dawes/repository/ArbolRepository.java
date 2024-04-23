package com.dawes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.ArbolVO;
import com.dawes.modelo.FincaVO;
@Repository
public interface ArbolRepository extends CrudRepository<ArbolVO, Integer> {

	
	
	boolean existsByFincaAndFilaAndColumna(FincaVO finca, int fila, int columna);

	 @Query("SELECT COUNT(a) > 0 FROM ArbolVO a WHERE a.finca = :#{#arbol.finca} AND a.fila = :#{#arbol.fila} AND a.columna = :#{#arbol.columna}")
	  boolean existsDuplicateArbol(@Param("arbol") ArbolVO arbol);
	 
	 List<ArbolVO> findByFinca(FincaVO finca);
}
