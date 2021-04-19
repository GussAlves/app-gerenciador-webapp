package br.com.gussalves.gerenciador.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MonitoracaoFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String paramAcao = request.getParameter("acao");
		
		Long inicio = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		Long fim = System.currentTimeMillis();

		System.out.println("Requisiçao " + paramAcao + ": " + (inicio - fim) + "s");
	}

}
