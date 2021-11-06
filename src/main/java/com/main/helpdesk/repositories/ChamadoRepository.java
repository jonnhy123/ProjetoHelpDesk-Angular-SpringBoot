package com.main.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}