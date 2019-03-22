package p2;

public class Application {
	public static void main (String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Vitor");
		aluno.setCpf("70448187493");
		Endereco e1 = new Endereco();
		e1.setRua("Rua Alcântara");
		e1.setComplemento("Não tem");
		e1.setNumero(193);
		e1.setCidade("Recife");
		aluno.setEndereco(e1);
		aluno.setAnoEntrada(2016);
		aluno.setPeriodoEntrada(1);
		aluno.imprimir();
		Professor professor = new Professor();
		professor.setNome("Gabriel");
		professor.setCpf("1234567890");
		Endereco e2 = new Endereco();
		e2.setRua("Rua Alphaville");
		e2.setComplemento("B");
		e2.setNumero(666);
		e2.setCidade("Recife");
		professor.setEndereco(e2);
		professor.imprimir();
		
	}

}
