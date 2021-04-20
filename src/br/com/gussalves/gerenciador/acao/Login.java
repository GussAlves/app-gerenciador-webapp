package br.com.gussalves.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gussalves.gerenciador.model.Banco;
import br.com.gussalves.gerenciador.model.Usuario;

public class Login implements Acao {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usuario = banco.validarUsuario(login, senha);
		
		if (usuario != null) {
			System.out.println("Usuario " + usuario.getLogin() + " logado! ");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=Home";
		} else {
			System.out.println("Usuario não autenticado!!");
			return "redirect:entrada?acao=FormLogin&erro=login";			
		}		
	}
}