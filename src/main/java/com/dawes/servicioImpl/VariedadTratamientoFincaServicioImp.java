package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.VariedadTratamientoFincaVO;
import com.dawes.repository.VariedadTratamientoFincaRepository;
import com.dawes.servicio.VariedadTratamientoFincaServicio;


@Service
public class VariedadTratamientoFincaServicioImp implements VariedadTratamientoFincaServicio  {
	@Autowired
	private VariedadTratamientoFincaRepository vtf;

	@Override
	public <S extends VariedadTratamientoFincaVO> S save(S entity) {
		return vtf.save(entity);
	}

	@Override
	public <S extends VariedadTratamientoFincaVO> Iterable<S> saveAll(Iterable<S> entities) {
		return vtf.saveAll(entities);
	}

	@Override
	public Optional<VariedadTratamientoFincaVO> findById(Integer id) {
		return vtf.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return vtf.existsById(id);
	}

	@Override
	public Iterable<VariedadTratamientoFincaVO> findAll() {
		return vtf.findAll();
	}

	@Override
	public Iterable<VariedadTratamientoFincaVO> findAllById(Iterable<Integer> ids) {
		return vtf.findAllById(ids);
	}

	@Override
	public long count() {
		return vtf.count();
	}

	@Override
	public void deleteById(Integer id) {
		vtf.deleteById(id);
	}

	@Override
	public void delete(VariedadTratamientoFincaVO entity) {
		vtf.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		vtf.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends VariedadTratamientoFincaVO> entities) {
		vtf.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		vtf.deleteAll();
	}

	
	
}
