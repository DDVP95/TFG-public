package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ArbolTratamientoVO;
import com.dawes.repository.ArbolTratamientoRepository;
import com.dawes.servicio.ArbolTratamientoServicio;

@Service
public class ArbolTratamientoServicioImp implements ArbolTratamientoServicio {

	
	@Autowired
	private ArbolTratamientoRepository atr;

	@Override
	public <S extends ArbolTratamientoVO> S save(S entity) {
		return atr.save(entity);
	}

	@Override
	public <S extends ArbolTratamientoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return atr.saveAll(entities);
	}

	@Override
	public Optional<ArbolTratamientoVO> findById(Integer id) {
		return atr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return atr.existsById(id);
	}

	@Override
	public Iterable<ArbolTratamientoVO> findAll() {
		return atr.findAll();
	}

	@Override
	public Iterable<ArbolTratamientoVO> findAllById(Iterable<Integer> ids) {
		return atr.findAllById(ids);
	}

	@Override
	public long count() {
		return atr.count();
	}

	@Override
	public void deleteById(Integer id) {
		atr.deleteById(id);
	}

	@Override
	public void delete(ArbolTratamientoVO entity) {
		atr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		atr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends ArbolTratamientoVO> entities) {
		atr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		atr.deleteAll();
	}
	
	
	
}
