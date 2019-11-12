package Prova02;

import java.util.ArrayList;


//Jessica Melo
public class TesteFuncionario {

	public static void visualizar(ArrayList<Funcionario> listaFuncionario) {
	 for (Funcionario funcionario : listaFuncionario) {
	 System.out.println(funcionario.toString());
	 }
	}

	public static void main(String[] args) {

		Setor umSetor = new Setor(123, "Desenvolvimento ");
		Cargo umCargo = new Cargo(456, "Programador 1", 2700.0);
		Cargo doisCargos = new Cargo(487, "Programador 2", 3700.0);
		Cargo tresCargos = new Cargo(357, "Programador 3", 4700.0);

		umSetor.adicionarFuncionario(new Funcionario(023, 2, "Pedro ", 24, false, umCargo));
		umSetor.adicionarFuncionario(new Funcionario(024, 0, "João ", 0, true,doisCargos));
		umSetor.adicionarFuncionario(new Funcionario(025, 1, "Marcelo ", 5, false, tresCargos));


		visualizar(umSetor.getFuncionarios());
	}
}
