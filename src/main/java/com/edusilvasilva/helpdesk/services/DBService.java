package com.edusilvasilva.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edusilvasilva.helpdesk.domain.Chamado;
import com.edusilvasilva.helpdesk.domain.Cliente;
import com.edusilvasilva.helpdesk.domain.Tecnico;
import com.edusilvasilva.helpdesk.domain.enums.Perfil;
import com.edusilvasilva.helpdesk.domain.enums.Prioridade;
import com.edusilvasilva.helpdesk.domain.enums.Status;
import com.edusilvasilva.helpdesk.repositories.ChamadoRepository;
import com.edusilvasilva.helpdesk.repositories.ClienteRepository;
import com.edusilvasilva.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Eduardo Silva Silva", "06816288475", "eduardo@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Tatiane Silva", "80527954780", "tati@email.com", "123");
		
		Cliente cli2 = new Cliente(null, "Isaque Levi Silva", "7582759829", "isaque@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
				
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		clienteRepository.saveAll(Arrays.asList(cli2));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
