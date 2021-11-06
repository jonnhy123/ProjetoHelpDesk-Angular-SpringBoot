package com.main.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}