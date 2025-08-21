package aula28081;

import java.util.ArrayList;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Criar um arraylist de integer, adiconar 10 números imprimir os pares somente.
		
				System.out.println("Começando o trabalho");
				Integer[] numerosa = new Integer[10];
				for(int i = 0; i < numerosa.length; i++) {
					
					numerosa[i] = 1;
					System.out.println(numerosa[i]);
				}
				
				ArrayList<Integer> numerosaList = new ArrayList<>();
				numerosaList.add(1);
				numerosaList.add(2);
				numerosaList.add(3);
				numerosaList.add(4);
				numerosaList.add(5);
				numerosaList.add(6);
				numerosaList.add(7);
				numerosaList.add(8);
				numerosaList.add(9);
				numerosaList.add(10);
				System.out.println(numerosaList);
				
				for (Integer numero : numerosaList) {
					if (numero % 2 == 0) {
						System.out.println(numero);
					}
					
			} 	
		

	}

}
