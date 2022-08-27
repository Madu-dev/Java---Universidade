//sistema para uma loja, como Cliente, Produto, Funcion�rio, Venda e Empresa

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int resp = 0;
		boolean op = false;
		Empresa empresa = new Empresa();
		Cliente[] clientes = new Cliente[10];
		Funcionario[] funcionarios = new Funcionario[10];
		Produto[] produtos = new Produto[10];
		int posProdutos = 0;
		int posClientes = 0;
		int posFuncionarios = 0;

		System.out.println("Informe o endere�o: ");
		empresa.setEndereco(in.nextLine());

		System.out.println("Informe a cidade: ");
		empresa.setCidade(in.nextLine());

		System.out.println("Informe o Telefone: ");
		empresa.setTelefone(in.nextLine());

		System.out.println("Informe o Email: ");
		empresa.setEmail(in.nextLine());

		System.out.println("Informe se � matriz ou filial: ");
		System.out.println("1 para Matriz");
		System.out.println("2 para Filial");
		resp = in.nextInt();

		do {
			if (resp == 1) {
				empresa.setMatriz(true);
			} else if (resp == 2) {
				empresa.setMatriz(false);
			} else {

				System.out.println("escolha 1 para matriz ou 2 para filial");
			}
		} while (resp != 1 && resp != 2);
		empresa.exibirInfo();
		while (op == false) {
			System.out.println("MENU");
			System.out.println("1 - Funcionario");
			System.out.println("2 - Cliente");
			System.out.println("3 - Comprar");
			System.out.println("4 - Produto");
			System.out.println("5 - Sair do programa");
			int resposta = in.nextInt();

			switch (resposta) {
				case 1:

					System.out.println("1 - Criar uma conta funcionario");
					System.out.println("2 - Entrar na conta funcionario");
					int respostaFuncionario = in.nextInt();
					while (respostaFuncionario != 1 && respostaFuncionario != 2) {
						System.out.println("Resposta invalida, digite 1 ou 2");
					}

					if (respostaFuncionario == 1) {
						if (posFuncionarios == 10) {
							System.out.println("N�mero maximo de funcionarios criados !");
						} else {
							Funcionario funcionario1 = new Funcionario();
							System.out.println("Informe o nome do funcionario: ");
							funcionario1.setNome(in.nextLine());

							System.out.println("Informe o endere�o do funcionario: ");
							funcionario1.setEndereco(in.nextLine());
							System.out.println("Informe a cidade do funcionario: ");
							funcionario1.setCidade(in.nextLine());
							System.out.println("Informe o telefone do funcionario: ");
							funcionario1.setTelefone(in.nextLine());
							System.out.println("Informe o email do funcionario: ");
							funcionario1.setEmail(in.nextLine());
							System.out.println("Informe o cpf do funcionario: ");
							funcionario1.setCpf(in.nextLine());
							System.out.println("Informe o Salario do funcionario: ");
							funcionario1.setSalario(in.nextDouble());

							funcionarios[posFuncionarios] = funcionario1;
							empresa.setFuncionarios(funcionarios);
							posFuncionarios++;
						}
					} else {
						if (posFuncionarios == 0) {
							System.out.println("Primeiro � necessario criar pelo menos um funcionario.");
						} else {
							System.out.println("Digite o cpf da conta do funcionario: ");
							String cpf = in.nextLine();
							boolean respostaVerificacao = empresa.verificarCpfFuncionario(cpf, 10);
							if (respostaVerificacao == true) {
								System.out.println("Conta do funcionario valida :)");
							} else {
								System.out.println("Conta do funcionario invalida :(");
							}
						}
					}

					break;
				case 2:
					System.out.println("1 - Criar uma conta cliente");
					System.out.println("2 - Entrar na conta cliente");
					int respostaCliente = in.nextInt();
					while (respostaCliente != 1 && respostaCliente != 2) {
						System.out.println("Resposta invalida, digite 1 ou 2");
					}
					/*
					 * boolean verificador = empresa.verificarVetorCliente();
					 * if(verificador == true){
					 * if(respostaCliente == 1){
					 * System.out.println("Informe o nome do Cliente: ");
					 * cliente.setNome(in.nextLine());
					 * System.out.println("Informe o endere�o do Cliente: ");
					 * cliente.setEndereco(in.nextLine());
					 * System.out.println("Informe a cidade do Cliente: ");
					 * cliente.setCidade(in.nextLine());
					 * System.out.println("Informe o telefone do Cliente: ");
					 * cliente.setTelefone(in.nextLine());
					 * System.out.println("Informe o email do Cliente: ");
					 * cliente.setEmail(in.nextLine());
					 * System.out.println("Informe o cpf do Cliente: ");
					 * cliente.setCpf(in.nextLine());
					 * 
					 * 
					 * }
					 * }
					 */

					break;
				case 3:
					System.out.println("Ol�");
					break;
				case 4:
					System.out.println("final do programa");
					op = true;
					break;
				default:
					System.out.println("Op��o Inv�lida escolha entre 1 a 4");
					break;
			}
		}
	}
}