package com.cubas.genericcontroller.controllers;

import java.util.List;

import com.cubas.genericcontroller.models.Response;
import com.cubas.genericcontroller.services.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class ControllerBasic<T> {

    @Autowired
    private ServiceInterface<T> service;

    @GetMapping(value = "/list")
    public ResponseEntity<Response<List<T>>> listaAll() {
        Response<List<T>> response = new Response<>();
        List<T> list = null;

        try {
            list = service.findAll();

            if (list == null) {
                response.setStatus(HttpStatus.NOT_FOUND);
            }else {
                response.setContent(list);
                response.setStatus(HttpStatus.OK);
            }

        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Response<List<T>>>(response, response.getStatus());
    }

    @PostMapping(value = "/new")
    public ResponseEntity<Response<T>> create(@RequestBody T model) {
        Response<T> response = new Response<>();
        service.insert(model);
        response.setContent(model);
        response.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<Response<T>>(response, response.getStatus());
    }

    @PutMapping(value = "/new")
    public ResponseEntity<Response<T>> update(@RequestBody T model) {
        Response<T> response = new Response<>();
        service.update(model);
        response.setContent(model);
        response.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<Response<T>>(response, response.getStatus());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Response<T>> get(@PathVariable("id") Long id) {
        Response<T> response = new Response<T>();
        T T;
        try {
            T = service.findById(id);
            if (T == null) {
                response.setStatus(HttpStatus.NOT_FOUND);
            }
            response.setContent(T);
            response.setStatus(HttpStatus.OK);
        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Response<T>>(response, HttpStatus.OK);
    }

    @DeleteMapping(value = "/admin/{id}")
    public ResponseEntity<Response<T>> delete(@PathVariable("id") Long id) {
        service.delete(id);
        Response<T> response = new Response<T>();
        response.setStatus(HttpStatus.GONE);
        return new ResponseEntity<Response<T>>(response, response.getStatus());
    }
}
