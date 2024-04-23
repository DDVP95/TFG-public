package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.TratamientoVO;
import com.dawes.repository.TratamientoRepository;
import com.dawes.servicio.TratamientoServicio;

@Service
public class TratamientoServicioImp implements TratamientoServicio {
	@Autowired
	private TratamientoRepository tr;

	@Override
	public <S extends TratamientoVO> S save(S entity) {
		return tr.save(entity);
	}

	@Override
	public <S extends TratamientoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return tr.saveAll(entities);
	}

	@Override
	public Optional<TratamientoVO> findById(Integer id) {
		return tr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return tr.existsById(id);
	}

	@Override
	public Iterable<TratamientoVO> findAll() {
		return tr.findAll();
	}

	@Override
	public Iterable<TratamientoVO> findAllById(Iterable<Integer> ids) {
		return tr.findAllById(ids);
	}

	@Override
	public long count() {
		return tr.count();
	}

	@Override
	public void deleteById(Integer id) {
		tr.deleteById(id);
	}

	@Override
	public void delete(TratamientoVO entity) {
		tr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		tr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends TratamientoVO> entities) {
		tr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		tr.deleteAll();
	}

}
