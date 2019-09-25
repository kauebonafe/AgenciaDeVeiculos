package br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testeController {

	@GetMapping("/teste")
	public String test() {
		
		return "teste";
	}
}
