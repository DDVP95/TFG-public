package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.TratamientoFincaVO;
import com.dawes.repository.TratamientoFincaRepository;
import com.dawes.servicio.TratamientoFincaServicio;

@Service
public class TratamientoFincaServicioImp implements TratamientoFincaServicio {
	@Autowired
	private TratamientoFincaRepository tfr;

	@Override
	public <S extends TratamientoFincaVO> S save(S entity) {
		return tfr.save(entity);
	}

	@Override
	public <S extends TratamientoFincaVO> Iterable<S> saveAll(Iterable<S> entities) {
		return tfr.saveAll(entities);
	}

	@Override
	public Optional<TratamientoFincaVO> findById(Integer id) {
		return tfr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return tfr.existsById(id);
	}

	@Override
	public Iterable<TratamientoFincaVO> findAll() {
		return tfr.findAll();
	}

	@Override
	public Iterable<TratamientoFincaVO> findAllById(Iterable<Integer> ids) {
		return tfr.findAllById(ids);
	}

	@Override
	public long count() {
		return tfr.count();
	}

	@Override
	public void deleteById(Integer id) {
		tfr.deleteById(id);
	}

	@Override
	public void delete(TratamientoFincaVO entity) {
		tfr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		tfr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends TratamientoFincaVO> entities) {
		tfr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		tfr.deleteAll();
	}

	
	
}
