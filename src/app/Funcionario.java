package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cpf;
	private Enum turno;
	private LocalDateTime dataCadastro;
	
	private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	public Funcionario(String nome, int idade, String cpf, Enum turno, LocalDateTime dataCadastro) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.turno = turno;
		this.dataCadastro = LocalDateTime.now();;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}


	public Enum getTurno() {
		return turno;
	}


	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public static DateTimeFormatter getFormatter() {
		return FORMATTER;
	}
	
	 public String getDataFormatada() {
	        return dataCadastro.format(FORMATTER);
	    }

	 @Override
	 public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", turno=" + turno
				+ ", dataCadastro =" + dataCadastro.format(FORMATTER) + "]";
	 }
	
	 
	 

}
