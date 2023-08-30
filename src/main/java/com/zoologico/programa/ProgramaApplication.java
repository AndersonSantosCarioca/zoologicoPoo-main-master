package com.zoologico.programa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ProgramaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramaApplication.class, args);
		Scanner sc = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("Escolha uma Opção:");
			System.out.println("1: Cadastrar Cliente.");
			System.out.println("2: Cadastrar Funcionário.");
			System.out.println("3: Cadastrar Recinto.");
			System.out.println("4: Cadastar Setor.");
			System.out.println("5: Cadastar Zoologico.");
			System.out.println("6: Sair.");
			System.out.println("\nOpção: ");
			escolha = sc.nextInt();

			switch (escolha) {
				case 1:
					cadastrarCliente(sc);
					break;
				case 2:
					cadastrarFuncionario(sc);
					break;
				case 3:
					cadastrarRecinto(sc);
					break;
				case 4:
					cadastrarSetor(sc);
					break;
				case 5:
					cadastarZoologico(sc);
					break;
				case 6:
					System.out.println("Saindo do programa.");
				default:
					System.out.println("Opção inválida.");
					break;
			}
		} while (escolha != 6);

		sc.close();
	}

	public static void cadastrarCliente(Scanner sc) {
		sc.nextLine();
		System.out.println("\nDigite o nome do Cliente:");
		String nomeDoCliente = sc.nextLine();

		System.out.println("\nDigite o endereço:");
		String enderecoCliente = sc.nextLine();

		System.out.println("\nDigite a quantidade de ingressos comprados:");
		int quantidadeIngressos = sc.nextInt();
		sc.nextLine();

		System.out.println("\nDigite o valor pago:");
		float valorPago = sc.nextFloat();

	}

	public static void cadastrarFuncionario(Scanner sc) {
		sc.nextLine();
		System.out.println("Digite o nome do funcionário:");
		String nomeFuncionario = sc.nextLine();

		System.out.println("Digite o endereço:");
		String enderecoFuncionario = sc.nextLine();

		System.out.println("Digite o cep:");
		int cepfuncionario = sc.nextInt();

		System.out.println("Digite o contato:");
		String contatoFuncionario = sc.nextLine();

		System.out.println("Digite o CPF:");
		String cpfFuncionario = sc.nextLine();

	}

	public static void cadastrarRecinto(Scanner sc) {
		sc.nextLine();
		System.out.println("Digite o nome do recinto");
		String nomeRecinto = sc.nextLine();

	}

	public static void cadastrarSetor(Scanner sc) {
		sc.nextLine();
		System.out.println("Digite o nome do Setor:");
		String nomeSetor = sc.nextLine();

	}

	public static void cadastarZoologico(Scanner sc) {
		sc.nextLine();
		System.out.println("Digite o nome do Zoológico:");
		String nomeZoologico = sc.nextLine();

		System.out.println("Digite o endereço:");
		String enderecoZoologico = sc.nextLine();

	}

}
