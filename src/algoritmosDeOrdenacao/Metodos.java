package algoritmosDeOrdenacao;

public class Metodos {
	
	//insertion
	public static int[] insertionSort(int[] vetor) {
		int aux, n;
		for (int i =1; i<vetor.length; i++) {
			aux = vetor[i];
			n = i-1;
			
		while ((n>=0) && (vetor[n]> aux)) {
			vetor[n+1] = vetor[n];
			n--;
			}
		vetor[n+1] = aux;
		}
		return vetor;
	}
	
	//selection
	public static int[] selectionSORT(int[] vetor) {
	
		for (int i = 0; i < vetor.length; i++) {
		int menor = i;
		for (int j = i + 1; j < vetor.length; j++) {
			if (vetor[j] < vetor[menor]) {
				menor = j;
				}
			}
		
		int aux = vetor[menor];
		vetor[menor] = vetor[i];
		vetor[i] = aux;
		}
		
		return vetor;
	}
	//merge
	public static int[] mergeSort(int[] vetorD, int[] w, int inicio, int fim) {
		if (inicio<fim) {
			int meio = (inicio+fim)/2;
			mergeSort(vetorD, w, inicio, meio);
			mergeSort(vetorD, w, meio+1, fim);
			intercalar(vetorD, w, inicio, meio, fim);
		}
		
		return vetorD;
	}
	private static void intercalar(int[] vetorD, int[] w, int inicio, int meio, int fim) {
		//COPIANDO O VETORDESORDENADO PARA O VETOR K
		for (int k = inicio; k<= fim; k++)
			w[k] = vetorD[k];
		
		int i = inicio;
		int j = meio + 1;
		
		for (int k = inicio; k<= fim; k++) {
			if(i > meio) vetorD[k] = w[j++];
			else if (j > fim) vetorD[k] = w [i];
			else if (w[i] < w[j]) vetorD[k] = w[i++];
			else vetorD[k] = w[j++];
		}
		
	}
	


}
