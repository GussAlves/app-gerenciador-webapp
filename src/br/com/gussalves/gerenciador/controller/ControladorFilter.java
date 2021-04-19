package br.com.gussalves.gerenciador.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gussalves.gerenciador.acao.Acao;

public class ControladorFilter implements Filter {

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		String paramAcao = request.getParameter("acao");
		String nomeClasse = "br.com.gussalves.gerenciador.acao." + paramAcao;
		
		String nome; 
		try {
			Class classe = Class.forName(nomeClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.exec(request, response);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ServletException(e);
		}
		
		String[] arrayNome = nome.split(":");
		if ( arrayNome[0].equals("forward") ) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + arrayNome[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(arrayNome[1]);
		}
	}

}
