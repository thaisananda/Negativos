package controller;

public class Controller04 {
	
	public Controller04() {
		super();
	}
	
	public int Negativos(int [] vetor, int tamanho) {
		/*
		 * Condição de parada: quando o tamanho do vetor chegar em 0
		 */
		int negativos = 0;
		
		if (tamanho == 0) {
			return negativos;
		}
		
		// Verifica se o último elemento do vetor é negativo
		if (vetor[tamanho - 1] < 0) {
			negativos = negativos + 1;
		}
		return negativos + Negativos(vetor, tamanho - 1);
		
	}

}
