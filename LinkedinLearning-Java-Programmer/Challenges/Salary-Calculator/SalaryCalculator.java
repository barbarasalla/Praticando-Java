package Learning_java;

public class SalaryCalculator {
	
	public static double salary (double horasPorSemana, double  ganhoPorHora, int diasFerias) {
		if(horasPorSemana < 0 || ganhoPorHora < 0 || diasFerias < 0) {
			return -1;
		}

		
		double quantSemana = 365/7;
		int horasFerias = diasFerias * 8;
		double descontoFerias = ganhoPorHora * horasFerias;
		double ganhoSemana = horasPorSemana * ganhoPorHora;
		double salarioAnual = (ganhoSemana * quantSemana) - descontoFerias;
		return salarioAnual;
	}
	
	public static void main(String[] args) {
		double salarioAnualTrabalhador = salary(40, 15, 8);
		if (salarioAnualTrabalhador == -1) {
			System.out.println("Entrada inválida!");
		}
		System.out.println(salarioAnualTrabalhador);
	}

}
