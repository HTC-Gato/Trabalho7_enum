package modelo;

import java.util.Scanner;
import app.Funcionario;
import app.Enum;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> cadastros = new ArrayList<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
        String continuar = "s";
	
        while (continuar.equalsIgnoreCase("s")) {
        	System.out.println("Digite seu nome:");
        	String nome = sc.nextLine();
        	
        	System.out.println("Informe sua idade:");
        	int idade = sc.nextInt();
        	sc.nextLine();
        	
        	System.out.println("Digite seu CPF:");
        	String cpf = sc.nextLine();
        	
        	
            System.out.println("Turno:");
            System.out.println("1 - Manhã");
            System.out.println("2 - Tarde");
            System.out.println("3 - Noite");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine(); 

            Enum Enum = null;
            switch (opcao) {
                case 1: Enum = Enum.MANHA; break;
                case 2: Enum = Enum.TARDE; break;
                case 3: Enum = Enum.NOITE; break;
                default:
                    System.out.println("Opção inválida, enum definido como MANHÃ.");
                    Enum = Enum.MANHA;
            }

            cadastros.add(new Funcionario(nome, idade, cpf, Enum, null));

            System.out.print("Deseja cadastrar outra pessoa? (s/n): ");
            continuar = sc.nextLine();
            System.out.println();
        }


        System.out.println(" LISTA DOS CADASTRADOS ");
        System.out.println();
        for (Funcionario f : cadastros) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println("Total de cadastrados: " + cadastros.size());

        sc.close();     	
        }

	}


