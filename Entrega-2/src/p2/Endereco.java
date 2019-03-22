package p2;

public class Endereco {
	private String rua;
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	private String complemento;
	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	private String cidade;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
		
	}
		
	public void imprimir() {
		System.out.println("Rua: " + this.getRua());
		System.out.println("Número: " + this.getNumero());
		System.out.println("Complemento: " + this.getComplemento());
		System.out.println("Cidade: " + this.getCidade());
	
	}
		

}
