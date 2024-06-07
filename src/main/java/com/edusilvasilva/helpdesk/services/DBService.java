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
		
		Tecnico tec2 = new Tecnico(null, "Tatiane Silva Silva", "31065870086", "tati2@email.com", "123");
		tec2.addPerfil(Perfil.ADMIN);
		
		Tecnico tec3 = new Tecnico(null, "Isaque Levi Silva", "04900350001", "isaquelevi@email.com", "123");
		tec3.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Tatiane Silva", "56868216076", "tati@email.com", "123");
		
		Cliente cli2 = new Cliente(null, "Isaque Levi Silva", "42405609002", "isaque@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 02", "Segundo chamado", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 03", "terceiro chamado", tec3, cli1);
		Chamado c4 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 04", "quarto chamado", tec1, cli2);
				
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		tecnicoRepository.saveAll(Arrays.asList(tec3));
		clienteRepository.saveAll(Arrays.asList(cli1));
		clienteRepository.saveAll(Arrays.asList(cli2));
		chamadoRepository.saveAll(Arrays.asList(c1));
		chamadoRepository.saveAll(Arrays.asList(c2));
		chamadoRepository.saveAll(Arrays.asList(c3));
		chamadoRepository.saveAll(Arrays.asList(c4));
		
	}

}
