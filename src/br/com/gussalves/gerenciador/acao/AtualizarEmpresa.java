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

public class AtualizarEmpresa implements Acao {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		String nome = req.getParameter("nome");
		String paramData = req.getParameter("data");
		
		Date data = null; 
		try { // formatar data
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(paramData);			
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscarEmpresa(id);
		empresa.setData(data);
		empresa.setNome(nome);
		
		return "redirect:entrada?acao=ListarEmpresas";
	}

}
