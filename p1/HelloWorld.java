package p1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class HelloWorld {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	Date data = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
	
	public void imprimir() {
		System.out.println(formatar.format(data)+ " - Olá " + this.getNome() +". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
		
	}
}
