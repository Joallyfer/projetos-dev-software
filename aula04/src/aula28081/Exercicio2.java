package aula28081;

import java.util.HashSet;
import java.util.Set;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um HashSet de String. Adicione 5 nomes, verifique se um nome especifico está no conjunto e remova-o. Exibe o conjunto atualizado.
		
		
		Set<String> nomes = new HashSet<String>();
		nomes.add("Joallyfer");
		nomes.add("Fabiane");
		nomes.add("Kymberly");
		System.out.println(nomes);
		
		//Verificando nome especifico
		System.out.println(nomes.contains("Joallyfer"));
		//Removendo o nome
		nomes.remove("Joallyfer");
		System.out.println(nomes);

	}

}
