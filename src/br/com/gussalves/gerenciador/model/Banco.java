package br.com.gussalves.gerenciador.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/** 
 * Classe para simular banco de dados em memória
 * @author gusal
 */
public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static Integer sequenciaId = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		Empresa empresa2 = new Empresa();
	
		empresa1.setNome("Google");
		empresa1.setId(sequenciaId++);
		
		empresa2.setNome("Facebook");
		empresa2.setId(sequenciaId++);
		
		Banco.listaEmpresas.addAll(Arrays.asList(empresa1, empresa2));
		
	}
	
	public void cadastrarEmpresa(Empresa empresa) {
		empresa.setId(sequenciaId++); //Adiciona id em sequencia
		Banco.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> listarEmpresas() {
		return Banco.listaEmpresas; 
	}
	
	public Empresa buscarEmpresa(Integer id) {
		
		Iterator<Empresa> lista = Banco.listaEmpresas.iterator();
		
		while ( lista.hasNext() ) {
			Empresa empresa = lista.next();
			if ( empresa.getId() == id ) 
				return empresa;
		}
		return null;
	}

	public void removerEmpresa(Integer id) {
		
		Iterator<Empresa> lista = Banco.listaEmpresas.iterator();
		
		while ( lista.hasNext() ) { 
			Empresa emp = lista.next();
			if ( emp.getId() == id ) 
				lista.remove();
		}
		
	}
	
}
