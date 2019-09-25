package br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.model.Usuario;
import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;

	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}
