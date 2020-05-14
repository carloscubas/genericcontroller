package com.cubas.genericcontroller.services;

import java.util.List;

import com.cubas.genericcontroller.models.Livro;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * @author carlos-silva
 * @version : $<br/>
 * : $
 * @since 5/14/20 9:22 AM
 */
@Service
public class LivroService implements ServiceInterface<Livro> {

    @Override
    public void insert (final Livro model) {

    }

    @Override
    public Livro findById (final Long id) {
        return null;
    }

    @Override
    public List<Livro> findAll () {
        return null;
    }

    @Override
    public void delete (final Long id) {

    }

    @Override
    public void update (final Livro model) {

    }
}
