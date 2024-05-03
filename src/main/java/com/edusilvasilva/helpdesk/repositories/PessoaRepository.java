package com.edusilvasilva.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edusilvasilva.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
