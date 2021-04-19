package br.com.gussalves.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gussalves.gerenciador.model.Banco;
import br.com.gussalves.gerenciador.model.Empresa;

public class BuscarEmpresa implements Acao {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
	
		Banco banco = new Banco();
		Empresa empresa = banco.buscarEmpresa(id);
		
		request.setAttribute("empresa", empresa);
		
		return "forward:formEditarEmpresa.jsp";
	}

}
