package br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}