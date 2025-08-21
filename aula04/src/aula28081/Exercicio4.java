package aula28081;

import java.util.ArrayList;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um arrayList de nomes e remova todos os que começam com a Letra "A"
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Andre");
		nomes.add("Joallyfer");
		nomes.add("Kymberly");
		
		System.out.println(nomes);
		
		ArrayList<String> remover = new ArrayList<>();
		
		for (int i = 0; i< nomes.size(); i++) {
			if(nomes.get(i).startsWith("A")) {
				remover.add(nomes.get(i));
			}
		}
		
		nomes.removeAll(remover);
		
		System.out.println(nomes);
	}

}
