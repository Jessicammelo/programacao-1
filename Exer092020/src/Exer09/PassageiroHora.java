package Exer09;

public class PassageiroHora {
	private int[][][] matriz = new int[12][30][24];// 12 meses,30 dias, 24 horas
	// private int[][] m = {{10,20,30,},{10,20,30}};

	public PassageiroHora() {
		// matriz = new int [12][30][24];
	}

	public void adiciona(int mes, int dia, int hora) {
		this.matriz[mes - 1][dia - 1][hora]++;// mes e hora comecam em 1 então voltamos pra zero igual vetor
		// this.matriz[mes-1][dia-1][hora] = this.matriz[mes-1][dia-1][hora]+1;
	}

	public int quantosPassageiros(int dia, int mes) {
		int total = 0;
		dia--;
		mes--;// para adaptar o valor natural para o indice na matriz
		for (int h = 0; h < this.matriz[mes][dia].length; h++) {
			total += this.matriz[mes][dia][h];
		}
		return total;
	}

	public int mesMenorFluxo() {
		int mesMenor = 1;// assuminto que mes menor é janeiro
		int quant = 0;
		int quantMenor = this.quantosPassageiros(1);// calculando janeiro
		for (int mes = 2; mes <= 12; mes++) {
			quant = this.quantosPassageiros(mes);
			if (quant < quantMenor) {
				mesMenor = mes;
				quantMenor = quant;
			}
		}

		return mesMenor;
	}

	public int quantosPassageiros(int mes) {
		int total = 0;
		for (int dia = 1; dia <= 30; dia++) {
			total += this.quantosPassageiros(dia, mes);
		}
		return total;

	}

	public int[] picoTransporte() {
		int diaMaior, mesMaior, horaMaior, quantMaior;
		quantMaior = Integer.MIN_VALUE;
		diaMaior = mesMaior = horaMaior = 0;
		for (int m = 0; m < this.matriz.length; m++) {
			for (int d = 0; d < this.matriz.length; d++) {
				for (int h = 0; h < this.matriz.length; h++) {
					if (this.matriz[m][d][h] > quantMaior) {
						quantMaior = this.matriz[m][d][h];
						mesMaior = m;
						diaMaior = d;
						horaMaior = h;
					}
				}
			}
		}
		int[] retorno = { diaMaior + 1, mesMaior + 1, horaMaior, quantMaior };
		return retorno;
	}

}
