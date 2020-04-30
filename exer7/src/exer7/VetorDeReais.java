package exer7;

import java.util.Arrays;

public class VetorDeReais {

	private double[] vetor = new double[10];
	
	public String exibe() {
		return Arrays.toString(this.vetor);
	}
	
	public int getTamanho() {
		return this.vetor.length;
	}
	
	public double getValor(int posicao) {
		return this.vetor[posicao];
	}
	
	public double multiplica(VetorDeReais outro) {		
	        if (this.getTamanho() != outro.getTamanho()) {
	           return Double.MIN_VALUE;//menor valor possivel
	        }
	        double m = 0;
	        for (int i = 0, j = this.getTamanho() - 1; i < this.vetor.length; i++, j--) {
	            m += this.vetor[i] * outro.getValor(j);
	        }
	        return m;
	    
		
	}

	public void inverte() {
		double temp;
		int meio = this.getTamanho() / 2;
		for (int i=0, j = this.getTamanho(); i< this.getTamanho() -1; i++,j--) {
			temp = this.vetor[i];
			this.vetor[i] = this.vetor[j];
			this.vetor[j] = temp;
		}
	}
		
		
		public double getmaiordiferença() {
	        double dif = Double.MIN_VALUE;
	        double temp;
	        for (int i = 0; i < vetor.length; i++) {
	            if ((i + 1 < vetor.length) && (this.vetor[i] - this.vetor[i + 1] > dif)) {
	                temp = this.vetor[i] - this.vetor[i + 1];
	            }
	        }
	        return dif;
	    }
}
