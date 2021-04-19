package br.com.gussalves.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gussalves.gerenciador.model.Banco;
import br.com.gussalves.gerenciador.model.Empresa;

public class FormCadastroEmpresa implements Acao {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeEmpresa = request.getParameter("nome");
		String dataParam = request.getParameter("data");
		
		Date data = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(dataParam);			
		} catch(ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa novaEmpresa = new Empresa(nomeEmpresa, data);
		
		Banco banco = new Banco();
		banco.cadastrarEmpresa(novaEmpresa);

		System.out.println("Empresa " + novaEmpresa.getNome() + " cadastrada!" );
		
		request.setAttribute("empresa", novaEmpresa);

		return "redirect:entrada?acao=Home";
	}
}