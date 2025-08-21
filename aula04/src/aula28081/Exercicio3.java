package aula28081;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicio3 {

	public static void main(String[] args) {
		//Crie um Map <String, Integer> para armazenar produtos e preços. Imprime todos os produtos acima de R$10.
		
		
		Map<String, Integer> produtos = new LinkedHashMap<>();
		produtos.put("Pipoca", 05);
		produtos.put("Feijão", 11);
		produtos.put("Arroz", 18);
		produtos.put("Chiclete", 02);
		
		System.out.println(produtos);
		
		System.out.println();
		System.out.println("Imprimindo somente abaixo de R$10: ");
		
		for(Map.Entry<String, Integer> entrada : produtos.entrySet())
			if(entrada.getValue() > 10) {
				System.out.println(entrada);
			}

	}

}
