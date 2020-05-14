package com.cubas.genericcontroller.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceInterface<T> {

	void insert(T model);

	T findById(Long id);

	Page<T> findAll(Pageable pageable);

	void delete(Long id);

	void update(T model);
}
