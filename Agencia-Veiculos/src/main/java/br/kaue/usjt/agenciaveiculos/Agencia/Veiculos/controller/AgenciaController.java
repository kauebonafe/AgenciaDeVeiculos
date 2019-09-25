package br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.model.Carro;
import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.service.CarroService;

@Controller
public class AgenciaController {

	@Autowired
	private CarroService carrosService;
	
	
	@GetMapping("/veiculos")
	public ModelAndView listarVeiculos () {
		ModelAndView mv = new ModelAndView ("lista_veiculos");
		mv.addObject(new Carro());
		List <Carro> carros = carrosService.listarTodos();
		mv.addObject("carros",carros);
		return mv;
	}
	
	@PostMapping("/veiculos")
	public String salvar (Carro carro) {
	carrosService.salvar(carro);
	return "redirect:/veiculos";
	} 
}
