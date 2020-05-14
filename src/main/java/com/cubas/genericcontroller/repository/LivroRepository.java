package com.cubas.genericcontroller.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cubas.genericcontroller.models.Livro;

/**
 * @author s2it_csilva
 * @version : $<br/>
 *          : $
 * @since 5/14/19 1:06 PM
 */
public interface LivroRepository extends JpaRepository<Livro, Long> {

	@Query(value = "from #{#entityName} l left join fetch l.autor a order by l.quantidadePaginas desc ", countQuery = "SELECT count(*) from #{#entityName} l")
	Page<Livro> listaLivros(Pageable pageable);

}
