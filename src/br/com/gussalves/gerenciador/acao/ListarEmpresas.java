package br.com.gussalves.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gussalves.gerenciador.model.Banco;
import br.com.gussalves.gerenciador.model.Empresa;

public class ListarEmpresas implements Acao {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando empresas");
		
		Banco banco = new Banco();
		List<Empresa> empresas = banco.listarEmpresas();
		
		//Lambda para deixar a lista em ordem alfabética 
		empresas.sort((e1, e2) -> {
			return e1.getNome().compareTo(e2.getNome());
		});
	
		request.setAttribute("empresas", empresas);	
		return "forward:listarEmpresas.jsp";	
	}
}