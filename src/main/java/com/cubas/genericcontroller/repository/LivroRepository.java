package com.cubas.genericcontroller.repository;

import java.util.List;

import com.cubas.genericcontroller.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * @author s2it_csilva
 * @version : $<br/>
 *          : $
 * @since 5/14/19 1:06 PM
 */
public interface LivroRepository extends JpaRepository<Livro, Long> {

	@Query(value = " from #{#entityName} l left join fetch l.autor a order by l.quantidadePaginas desc ")
	List<Livro> listaLivros();

}
