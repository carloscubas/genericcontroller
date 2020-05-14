package com.cubas.genericcontroller.services;

import java.util.List;

import com.cubas.genericcontroller.exception.LivroNotFoundException;
import com.cubas.genericcontroller.models.Livro;
import com.cubas.genericcontroller.repository.LivroRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public void insert (final Livro model) {
        livroRepository.save(model);
    }

    @Override
    public Livro findById (final Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new LivroNotFoundException());
    }

    @Override
    public List<Livro> findAll () {
        return livroRepository.listaLivros();
    }

    @Override
    public void delete (final Long id) {
        livroRepository.deleteById(id);
    }

    @Override
    public void update (final Livro model) {
        livroRepository.save(model);
    }
}
