package aula28081;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
	//Trabalhando com Array List (Precisa importar o Array List)
		String[] nomes = new String[3];
		for(int i = 0; i < nomes.length; i++) {
			
			nomes[i] = "Nome";
			System.out.println(nomes[i]);
		}
		ArrayList<String> nomesList = new ArrayList<>();
		nomesList.add("Marlon");
		nomesList.add("Cidadão");
		nomesList.add("Joallyfer");
		System.out.println(nomesList);
		nomesList.remove("Cidadão");
		nomesList.remove(1);
		System.out.println(nomesList);
		System.out.println(nomesList.get(0));
		System.out.println();
		
		// Terminando de trabalhar com o Array List
		
		//*****************************************************//
		
		//Começando a trabalhar com Set (Precisa importar o set e o hashset)
		System.out.println("Aqui começa o Set:");
		Set<String> coisas = new HashSet<String>();
		coisas.add("Maça");
		coisas.add("Banana");
		coisas.add("Banana");
		coisas.add("Goiaba");
		System.out.println(coisas);
		System.out.println(coisas.contains("Banana")); // Tem banana, retorna true
		System.out.println(coisas.contains("Bacana")); // Não tem bacana, retorna False
		
	
		// Terminando o Set
		
		//*****************************************************
		
		// Começando o Map (Preicsa importar o map e hashmap.
		
		System.out.println();
		System.out.println("Aqui Começa o Map: ");
		Map<Integer, String> alunos = new LinkedHashMap<>();
		alunos.put(12, "Joallyfer");
		alunos.put(15, "Kymberly");
		alunos.put(18, "Lopes");
		System.out.println(alunos);
		System.out.println(alunos.get(12));
		alunos.remove(12);
		System.out.println(alunos);

		// Aqui termina o Rashmap
		//************************
		
		
		
			
		
		
		
	}

}
