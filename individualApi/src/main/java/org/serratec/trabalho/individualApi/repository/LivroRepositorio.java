package org.serratec.trabalho.individualApi.repository;

import org.serratec.trabalho.individualApi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro,Long>{
	
	

}
