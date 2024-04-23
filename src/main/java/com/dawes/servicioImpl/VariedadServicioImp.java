package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.VariedadVO;
import com.dawes.repository.VariedadRepository;
import com.dawes.servicio.VariedadServicio;

@Service
public class VariedadServicioImp implements VariedadServicio {

	@Autowired
	private VariedadRepository vr;

	@Override
	public <S extends VariedadVO> S save(S entity) {
		return vr.save(entity);
	}

	@Override
	public <S extends VariedadVO> Iterable<S> saveAll(Iterable<S> entities) {
		return vr.saveAll(entities);
	}

	@Override
	public Optional<VariedadVO> findById(Integer id) {
		return vr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return vr.existsById(id);
	}

	@Override
	public Iterable<VariedadVO> findAll() {
		return vr.findAll();
	}

	@Override
	public Iterable<VariedadVO> findAllById(Iterable<Integer> ids) {
		return vr.findAllById(ids);
	}

	@Override
	public long count() {
		return vr.count();
	}

	@Override
	public void deleteById(Integer id) {
		vr.deleteById(id);
	}

	@Override
	public void delete(VariedadVO entity) {
		vr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		vr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends VariedadVO> entities) {
		vr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		vr.deleteAll();
	}

	
	
}
