package PraticandoJava;

import java.util.Scanner;

public class CalculoSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		double x, y, s=0, resultado=0;
		int ix=2, iy=3;
		System.out.println("Digite o primeiro valor: ");
		x=in.nextDouble();
		System.out.println("Digite o segundo valor: ");
		y=in.nextDouble();
		
		s=(x+y);
		
		do {
			if (ix%2!=0) {
				s=-((Math.pow(x, ix)*Math.pow(y, iy))/Math.pow((x+y),ix*iy));
			} else {
				s=+((Math.pow(x, ix)*Math.pow(y, iy))/Math.pow((x+y),ix*iy));
			}
			ix++;
			iy+=2;			
		}while(s<0.001);
		
		System.out.println(s);
	}

}
