package ExemploArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = 0;
		int soma = 0;

		ArrayList<Integer> numeros = new ArrayList<>(4);

		for (int i = 0; i <= 4; i++) {

			System.out.println("Informe um numero: ");
			numero = ler.nextInt();

			soma += numero;
			numeros.add(numero);

		}

		ler.close();
		System.out.println("A soma é : " + soma);
	}
}
