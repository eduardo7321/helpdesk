package com.edusilvasilva.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edusilvasilva.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
