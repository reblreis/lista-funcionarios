package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import entities.Pessoa;
import interfaces.IFuncionarioRepository;

public class FuncionarioRepositoryCSV implements IFuncionarioRepository {

	@Override // override = substituir
	public void exportar(Funcionario funcionario) throws Exception {

		PrintWriter printWriter = new PrintWriter("c:\\clientes\\funcionario.csv");

		printWriter.write("\nCPF do funcionario.........: " + funcionario.getCpf());
		printWriter.write("\nMATRICULA do funcionario...: " + funcionario.getMatricula());
		printWriter.write("\nSALARIO do funcionario.....: " + funcionario.getSalario());

		// foreach (para cada...)
		for (Pessoa pessoa : funcionario.getPessoas()) {

			printWriter.write("\nID da pessoa.....: " + pessoa.getId());
			printWriter.write("\nNome da pessoa...: " + pessoa.getNome());
		}

		printWriter.flush();
		printWriter.close();

	}

}
