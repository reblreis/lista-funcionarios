package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import entities.Pessoa;
import interfaces.IFuncionarioRepository;

public class FuncionarioRepositoryTXT implements IFuncionarioRepository {

	@Override // override = substituir
	public void exportar(Funcionario funcionario) throws Exception {

		PrintWriter printWriter = new PrintWriter("c:\\clientes\\funcionario.txt");

		printWriter.write("\nCPF do funcionário.........: " + funcionario.getCpf());
		printWriter.write("\nMATRICULA do funcionário...: " + funcionario.getMatricula());
		printWriter.write("\nSALÁRIO do funcionário.....: " + funcionario.getSalario());

		// foreach (para cada...)
		for (Pessoa pessoa : funcionario.getPessoas()) {

			printWriter.write("\nID da pessoa.....: " + pessoa.getId());
			printWriter.write("\nNome da pessoa...: " + pessoa.getNome());
		}

		printWriter.flush();
		printWriter.close();

	}
}
