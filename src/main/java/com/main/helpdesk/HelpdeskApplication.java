package com.main.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.helpdesk.domain.Chamado;
import com.main.helpdesk.domain.Cliente;
import com.main.helpdesk.domain.Tecnico;
import com.main.helpdesk.domain.enums.Perfil;
import com.main.helpdesk.domain.enums.Prioridade;
import com.main.helpdesk.domain.enums.Status;
import com.main.helpdesk.repositories.ChamadoRepository;
import com.main.helpdesk.repositories.ClienteRepository;
import com.main.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tecnico = new Tecnico(null, "Jhonatan Mattana", "09380226950", "jhonatan_mattana@outlook.com", "123");
		tecnico.addPerfil(Perfil.ADMIN);

		Cliente cliente = new Cliente(null, "Patricia de Jesus Garcia", "15485626401", "patyy_garcia00@hotmail.com", "321");

		Chamado chamado = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tecnico, cliente);

		tecnicoRepository.saveAll(Arrays.asList(tecnico));
		clienteRepository.saveAll(Arrays.asList(cliente));
		chamadoRepository.saveAll(Arrays.asList(chamado));
	}

}