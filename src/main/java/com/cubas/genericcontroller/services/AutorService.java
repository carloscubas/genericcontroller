package com.cubas.genericcontroller.services;

import java.util.List;

import com.cubas.genericcontroller.exception.AutorNotFoundException;
import com.cubas.genericcontroller.exception.LivroNotFoundException;
import com.cubas.genericcontroller.models.Autor;
import com.cubas.genericcontroller.models.Livro;
import com.cubas.genericcontroller.repository.AutorRepository;
import com.cubas.genericcontroller.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author carlos-silva
 * @version : $<br/>
 * : $
 * @since 5/14/20 9:47 AM
 */
public class AutorService  implements ServiceInterface<Autor> {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void insert (final Autor model) {
        autorRepository.save(model);
    }

    @Override
    public Autor findById (final Long id) {
        return autorRepository.findById(id).orElseThrow(() -> new AutorNotFoundException());
    }

    @Override
    public List<Autor> findAll () {
        return autorRepository.findAll();
    }

    @Override
    public void delete (final Long id) {
        autorRepository.deleteById(id);
    }

    @Override
    public void update (final Autor model) {
        autorRepository.save(model);
    }
}
