package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.UserVO;
import com.dawes.repository.UserRepository;
import com.dawes.servicio.UserServicio;

@Service
public class UserServicioImp implements UserServicio {
	@Autowired
	private UserRepository ur;

	@Override
	public <S extends UserVO> S save(S entity) {
		return ur.save(entity);
	}

	@Override
	public <S extends UserVO> Iterable<S> saveAll(Iterable<S> entities) {
		return ur.saveAll(entities);
	}

	@Override
	public Optional<UserVO> findById(Integer id) {
		return ur.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return ur.existsById(id);
	}

	@Override
	public Iterable<UserVO> findAll() {
		return ur.findAll();
	}

	@Override
	public Iterable<UserVO> findAllById(Iterable<Integer> ids) {
		return ur.findAllById(ids);
	}

	@Override
	public long count() {
		return ur.count();
	}

	@Override
	public void deleteById(Integer id) {
		ur.deleteById(id);
	}

	@Override
	public void delete(UserVO entity) {
		ur.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		ur.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends UserVO> entities) {
		ur.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		ur.deleteAll();
	}

	 @Override
	    public Optional<UserVO> findByUsername(String username) {
	        return ur.findByUsername(username);
	    }

}
