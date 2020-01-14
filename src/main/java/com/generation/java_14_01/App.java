package com.generation.java_14_01;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.generation.model.Carne;
import com.generation.service.CarneService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0, id = 0, qtd = 0, opId = 0;
		Double precoKg = 0.0;
		String tipo;

		CarneService service = new CarneService();
		Carne c1 = new Carne(1, "Boi", 10, 22.0);
		Carne c2 = new Carne(2, "Frango", 12, 32.0);
		Carne c3 = new Carne(3, "Porco", 52, 52.0);
		Carne c4 = new Carne(4, "Frango", 72, 72.0);

		service.addLista(c1);
		service.addLista(c2);
		service.addLista(c4);
		service.getAllLista();
		service.deleteLista(c1);
		System.out.println("--------------------------------------");
		service.addLista(c3);
		service.addEstoque(c3,10);
		service.getAllLista();
		// System.out.println(c1);

		System.out.println("--------------------------------------");
		System.out.println("Estoque do açougue" + "\nDigite a sua opção" + "\n1-Novo registro"
				+ "\n2-Excluir um registro" + "\n3-Listar os dados"
						+ "\n4-Adicionar carnes ao estoque");
		op = sc.nextInt();
		System.out.println("--------------------------------------");

		switch (op) {

		case 1:

			System.out.println("Registrando um novo produto");
			System.out.println("Digite o id do produto: ");
			id = sc.nextInt();
			System.out.println("Digite o tipo de carne: ");
			sc.nextLine();
			tipo = sc.nextLine();
			System.out.println("Digite a quantidade em estoque: ");
			qtd = sc.nextInt();
			System.out.println("Digite o preço por quilo: ");
			precoKg = sc.nextDouble();

			Carne cr = new Carne(id, tipo, qtd, precoKg);
			service.addLista(cr);

			break;
		case 2:

			System.out.println("Digite o id do produto a ser excluido: ");
			opId = sc.nextInt();

			List<Carne> carnes = service.getCarnes();

			for (Iterator<Carne> i = carnes.iterator(); i.hasNext();) {
				Carne carneDelete = i.next();

				if (carneDelete.getId() == opId) {
					i.remove();

				}

			}

			service.getAllLista();

			// service.getAllLista();

			break;
		case 3:
			System.out.println("Listando todos os dados\n ");

			service.getAllLista();
			break;
		case 4:
			
			System.out.println("Digite o id do produto a ser alterado");
			int op2 = sc.nextInt();
			
			for (Carne carne : service.getCarnes()) {
				if(carne.getId() == op2) {
					System.out.println("Digite a quantidade a ser adicionada: ");
					int x = sc.nextInt();
					service.addEstoque(carne, x);
				}
				
				
			}
			
			for (Carne carne : service.getCarnes()) {
				System.out.println(carne);
			}
			
			break;

		default:
			break;
		}

	}
}
