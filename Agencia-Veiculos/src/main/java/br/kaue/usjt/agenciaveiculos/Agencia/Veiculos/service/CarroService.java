package br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.model.Calculadora;
import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.model.Carro;
import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.repository.CarroRepository;

@Service
public class CarroService {
	@Autowired
	private CarroRepository carrosRepo;

	public void salvar(Carro carro) {
		carrosRepo.save(carro);
	}

	public List<Carro> listarTodos() {
		
		List<Carro> carros = carrosRepo.findAll();
		for (Carro carro : carros)
				 carro.setAutonomia(Calculadora.calculaAutonomia(carro.getTanque(),
						 carro.getEficiencia()));
			return carrosRepo.findAll();
			}
		

	}

