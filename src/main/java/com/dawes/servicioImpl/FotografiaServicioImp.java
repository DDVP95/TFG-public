package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.FotografiaVO;
import com.dawes.repository.FotografiaRepository;
import com.dawes.servicio.FotografiaServicio;

@Service
public class FotografiaServicioImp implements FotografiaServicio {

	@Autowired
	private  FotografiaRepository fr;

	@Override
	public <S extends FotografiaVO> S save(S entity) {
		return fr.save(entity);
	}

	@Override
	public <S extends FotografiaVO> Iterable<S> saveAll(Iterable<S> entities) {
		return fr.saveAll(entities);
	}

	@Override
	public Optional<FotografiaVO> findById(Integer id) {
		return fr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return fr.existsById(id);
	}

	@Override
	public Iterable<FotografiaVO> findAll() {
		return fr.findAll();
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
	public void delete(FotografiaVO entity) {
		fr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		fr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends FotografiaVO> entities) {
		fr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		fr.deleteAll();
	}

	@Override
	public Iterable<FotografiaVO> findAllById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
