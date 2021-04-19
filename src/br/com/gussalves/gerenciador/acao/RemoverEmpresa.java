package br.com.gussalves.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gussalves.gerenciador.model.Banco;

public class RemoverEmpresa implements Acao {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		banco.removerEmpresa(id);

		System.out.print("Empresa de ID: #" + id + " removida.");
		
		return "redirect:entrada?acao=ListarEmpresas";
	}

}
