package br.com.gussalves.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home implements Acao {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empresa = request.getParameter("empresa");
		request.setAttribute("empresa", empresa);
		
		return "forward:default.jsp";
	}

}
