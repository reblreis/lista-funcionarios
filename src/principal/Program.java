package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Funcionario;
import entities.Pessoa;
import interfaces.IFuncionarioRepository;
import repositories.FuncionarioRepositoryCSV;
import repositories.FuncionarioRepositoryTXT;

public class Program {

	public static void main(String[] args) {

		// criando um objeto Funcionario
		Funcionario funcionario = new Funcionario("125444785-45", "12254", 5.223);

		// criando objetos da classe pessoa
		Pessoa pessoa1 = new Pessoa(1, "Fabiana Gomes");

		Pessoa pessoa2 = new Pessoa(2, "Cássia Oliveira");

		Pessoa pessoa3 = new Pessoa(3, "Leopoldo Pacheco");

		Pessoa pessoa4 = new Pessoa(4, "Gabriela Felizardo");

		// criando uma lista de pessoas
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		// adicionando as pessoas dentro da lista
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		// adicionando a lista de pessoas no funcionário
		funcionario.setPessoas(pessoas);

		// criando um polimorfismo da interface

		IFuncionarioRepository funcionarioRepository = null; // vazio

		String opcao = JOptionPane.showInputDialog("Informe CSV ou TXT:");

		switch (opcao.toUpperCase()) {

		case "TXT":
			// POLIMORFISMO
			funcionarioRepository = new FuncionarioRepositoryTXT();
			break;

		case "CSV":
			// POLIMORFISMO
			funcionarioRepository = new FuncionarioRepositoryCSV();
			break;

		}

		try {
			funcionarioRepository.exportar(funcionario);
			System.out.println("Dados gravados com sucesso!");
		}

		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}