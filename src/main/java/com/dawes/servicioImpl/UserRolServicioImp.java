package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.UserRolVO;
import com.dawes.repository.UserRolRepository;
import com.dawes.servicio.UserRolServicio;
@Service
public class UserRolServicioImp implements UserRolServicio {
	@Autowired
	private UserRolRepository urr;

	@Override
	public <S extends UserRolVO> S save(S entity) {
		return urr.save(entity);
	}

	@Override
	public <S extends UserRolVO> Iterable<S> saveAll(Iterable<S> entities) {
		return urr.saveAll(entities);
	}

	@Override
	public Optional<UserRolVO> findById(Integer id) {
		return urr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return urr.existsById(id);
	}

	@Override
	public Iterable<UserRolVO> findAll() {
		return urr.findAll();
	}

	@Override
	public Iterable<UserRolVO> findAllById(Iterable<Integer> ids) {
		return urr.findAllById(ids);
	}

	@Override
	public long count() {
		return urr.count();
	}

	@Override
	public void deleteById(Integer id) {
		urr.deleteById(id);
	}

	@Override
	public void delete(UserRolVO entity) {
		urr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		urr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends UserRolVO> entities) {
		urr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		urr.deleteAll();
	}

}
