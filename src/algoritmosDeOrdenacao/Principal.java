package algoritmosDeOrdenacao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		   Scanner teclado = new Scanner(System.in);
			
			
			
			System.out.println("Algoritmos de Ordenao\n");
			System.out.println("Escolha qual metodo deseja usar:");
			System.out.println("1 -> InsertionSORT");
			System.out.println("2 -> SelectionSORT");
			System.out.println("3 -> MergeSORT");
		
			
			int opcao = teclado.nextInt();
			teclado.close();
		
			
			switch (opcao) {
			
			case 1:
				int[] vetordesordenado = gerarvetor(10);
				int[] vetorordenado = new int [10];
				System.out.println("<====Vetor desordenado====>");
				System.out.println(Arrays.toString(vetordesordenado));
				System.out.println("\nVetor ordenado pelo mtodo: InsetionSORT");
				vetorordenado = Metodos.insertionSort(vetordesordenado);
				for(int i : vetorordenado) {
					System.out.println(i+ " ");
					}
				break;
				
			case 2:
				int[] vetordesordenado1 = gerarvetor(10);
				int[] vetorordenado1 = new int [10];
				System.out.println("<====Vetor desordenado====>");
				System.out.println(Arrays.toString(vetordesordenado1));
				System.out.println("\nVetor ordenado pelo mtodo: SelectionSORT");
				vetorordenado = Metodos.selectionSORT(vetordesordenado1);
				for(int i : vetorordenado) {
					System.out.println(i+ " ");
					}
				break;
				

				
			case 3:
				int[] vetordesordenado2 = gerarvetor(10);
				int[] vetorordenado2 = new int [10];
				System.out.println("<====Vetor desordenado====>");
				System.out.println(Arrays.toString(vetordesordenado2));
				System.out.println("\nVetor ordenado pelo mtodo: mergeSORT");
				vetorordenado = Metodos.mergeSort(vetordesordenado2, new int[vetordesordenado2.length], 0, vetordesordenado2.length-1);
				for(int i : vetorordenado) {
					System.out.println(i+ " ");
				}
				break;
				
			default :
				System.out.println("\nDe 1 a 3 gênio :p");
				break;	
			}
		}



		

		
	
//criar numeros random
		
private static int[] gerarvetor(int tamanho) {
	int[] vetorNaoOrdenado = new int[tamanho];
	Random gerar = new Random();
	for (int i = 0; i <vetorNaoOrdenado.length; i++) {
		vetorNaoOrdenado[i] = gerar.nextInt(20);
	}
	
	return vetorNaoOrdenado;
}

	
}



