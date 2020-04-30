package exer2;

public class InteiroPositivo {

	
	private int x;
	
	public void setValor(int valor) {
		if ( valor >= 0) {
			this.x = valor;
		}
	}
	
	public int multiplica(InteiroPositivo outro) {
		 return this.x * outro.getValor();
	}
	
	public int getValor() {
		return this.x;
	}
	
	public long fatorial() {
	        return fatorial(this.x);
	}
	
	public long fatorial(int valor) {
		long fatorial = 1;
        for(int i = this.x; i > 0; i --) {
            fatorial = fatorial * i;
        }
        return fatorial;	
	}
	
	public String divisoresInteiros() {
		String retorno = "os divisores são: ";
		int contador = 0;
		for (int num = 1; num <= this.x; num++) {
		if (this.x % num == 0) {
			retorno += num+", ";
			contador++;
		}
		}
		int pos = retorno.lastIndexOf(", ");
		if (pos != -1) {
			retorno.substring(0, pos);
		}
		return retorno+ "e a quantidade de divisores é " +contador;
	}
	
	public int[] fibonacci() {
		int[]retorno = new int[this.x];
		if (this.x > 0) {
			retorno[0]= 1;
            if (this.x > 1) {
            	retorno[1]= 1;
            }
        }
        for (int i = 2; i < this.x ; i++) {
        	retorno[i] = retorno[i-2]+retorno[i-1];
        }
        return retorno;
	}
	
	public double getValorI() {
		double i = 0;
		double den = 0;
		for (int num = 1; num <= this.x; num++) {
			den = this.x - (num-1);
			i+= num /den;
		}
		
		return i;
	}
	
	public double getValorP() {
		double p =0;
		double den = 0;
		boolean soma = true;
		for (int num = 1; num <= this.x; num++) {
			den = num*2;
			if (soma) {
				p+= num /den;
			}else {
				p-=num/ den;
			}
			soma = !soma;
		}
		return p;
	}
}

