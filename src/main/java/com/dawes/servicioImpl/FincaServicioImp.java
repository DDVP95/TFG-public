package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.FincaVO;
import com.dawes.repository.FincaRepository;
import com.dawes.servicio.FincaServicio;

@Repository
public class FincaServicioImp implements FincaServicio {

	@Autowired
	private FincaRepository fr;

	@Override
	public <S extends FincaVO> S save(S entity) {
		return fr.save(entity);
	}

	@Override
	public <S extends FincaVO> Iterable<S> saveAll(Iterable<S> entities) {
		return fr.saveAll(entities);
	}

	@Override
	public Optional<FincaVO> findById(Integer id) {
		return fr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return fr.existsById(id);
	}

	@Override
	public Iterable<FincaVO> findAll() {
		return fr.findAll();
	}

	@Override
	public Iterable<FincaVO> findAllById(Iterable<Integer> ids) {
		return fr.findAllById(ids);
	}

	@Override
	public long count() {
		return fr.count();
	}

	@Override
	public void deleteById(Integer id) {
		fr.deleteById(id);
	}

	@Override
	public void delete(FincaVO entity) {
		fr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		fr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends FincaVO> entities) {
		fr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		fr.deleteAll();
	}

	
	
}
