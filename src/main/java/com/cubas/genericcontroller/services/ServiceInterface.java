package com.cubas.genericcontroller.services;

import java.util.List;

/**
 * @author carlos-silva
 * @version : $<br/>
 * : $
 * @since 5/14/20 9:21 AM
 */
public interface ServiceInterface<T> {

    void insert(T model);

    T findById(Long id);

    List<T> findAll();

    void delete(Long id);

    void update(T model);
}
