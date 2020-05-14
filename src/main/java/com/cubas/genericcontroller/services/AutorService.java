package com.cubas.genericcontroller.services;

import java.util.List;

import com.cubas.genericcontroller.models.Autor;
import com.cubas.genericcontroller.models.Livro;

/**
 * @author carlos-silva
 * @version : $<br/>
 * : $
 * @since 5/14/20 9:47 AM
 */
public class AutorService  implements ServiceInterface<Autor> {

    @Override
    public void insert (final Autor model) {

    }

    @Override
    public Autor findById (final Long id) {
        return null;
    }

    @Override
    public List<Autor> findAll () {
        return null;
    }

    @Override
    public void delete (final Long id) {

    }

    @Override
    public void update (final Autor model) {

    }
}
