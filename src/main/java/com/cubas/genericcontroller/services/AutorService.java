package com.cubas.genericcontroller.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cubas.genericcontroller.exception.AutorNotFoundException;
import com.cubas.genericcontroller.models.Autor;
import com.cubas.genericcontroller.repository.AutorRepository;

/**
 * @author carlos-silva
 * @version : $<br/>
 *          : $
 * @since 5/14/20 9:47 AM
 */
@Service
public class AutorService implements ServiceInterface<Autor> {

	@Autowired
	private AutorRepository autorRepository;

	@Override
	public void insert(final Autor model) {
		autorRepository.save(model);
	}

	@Override
	public Autor findById(final Long id) {
		return autorRepository.findById(id).orElseThrow(() -> new AutorNotFoundException());
	}

	@Override
	public Page<Autor> findAll(Pageable pageable) {
		return autorRepository.findAll(pageable);
	}

	@Override
	public void delete(final Long id) {
		autorRepository.deleteById(id);
	}

	@Override
	public void update(final Autor model) {
		autorRepository.save(model);
	}
}
