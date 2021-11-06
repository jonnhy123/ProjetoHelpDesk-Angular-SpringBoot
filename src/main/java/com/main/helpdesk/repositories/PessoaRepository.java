package com.main.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}