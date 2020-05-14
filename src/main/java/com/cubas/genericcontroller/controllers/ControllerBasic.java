package com.cubas.genericcontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cubas.genericcontroller.dtos.PageDTO;
import com.cubas.genericcontroller.services.ServiceInterface;

public abstract class ControllerBasic<T> {

	@Autowired
	private ServiceInterface<T> service;

	@GetMapping(value = "/list")
	public ResponseEntity<PageDTO<T>> listaAll(Pageable pageable) {
		Page<T> list = null;
		try {
			list = service.findAll(pageable);
			if (list == null) {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok(new PageDTO<T>(list.getContent(), list.getSize(), list.getNumber()));
	}

	@PostMapping(value = "/new")
	public ResponseEntity<T> create(@RequestBody T model) {
		service.insert(model);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping(value = "/new")
	public ResponseEntity<T> update(@RequestBody T model) {
		service.update(model);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<T> get(@PathVariable("id") Long id) {
		T T;
		try {
			T = service.findById(id);
			if (T == null) {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok(T);
	}

	@DeleteMapping(value = "/admin/{id}")
	public ResponseEntity<T> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.status(HttpStatus.GONE).build();
	}
}
