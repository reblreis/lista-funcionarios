package entities;

import java.util.List;

public class Funcionario extends Pessoa {

	private String cpf;
	private String matricula;
	private Double salario;
	private Funcao funcao;
	private Setor setor;
	private List<Pessoa> pessoas;

	public Funcionario() {

	}

	public Funcionario(String cpf, String matricula, Double salario) {
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}

	public Funcionario(String cpf, String matricula, Double salario, Funcao funcao, Setor setor) {
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
		this.funcao = funcao;
		this.setor = setor;
	}

	public Funcionario(String cpf, String matricula, Double salario, Funcao funcao, Setor setor, List<Pessoa> pessoas) {
		super();
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
		this.funcao = funcao;
		this.setor = setor;
		this.pessoas = pessoas;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
