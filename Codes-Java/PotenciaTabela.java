package PraticandoJava;

public class PotenciaTabela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("Number  Square   Cube");
	for(int i=0; i<11; i++) {
		System.out.print(i);
		double num=i;
		if(num==4) {
			System.out.print("       1");
		}
			else if(num==5) {
				System.out.print("       2");
			}
				else if(num==7) {
					System.out.print("       4");
				}
					else if(num==10) {
						System.out.printf("      %.0f", Math.pow(num, 2));
					}
						else {
							System.out.printf("       %.0f",Math.pow(num, 2));
						}
		
		double num1=i;
		if(num1==6) {
			System.out.printf("       %.0f",Math.pow(num1, 3));
			System.out.println("");
		}
			else if(num==8) {
				System.out.printf("       %.0f",Math.pow(num1, 3));
				System.out.println("");
			}
				else if(num==9) {
					System.out.printf("       %.0f",Math.pow(num1, 3));
					System.out.println("");
				}
					else if(num==10) {
						System.out.printf("      %.0f",Math.pow(num1, 3));
						System.out.println("");
					}
					else {
						System.out.printf("        %.0f",Math.pow(num1, 3));
						System.out.println("");
					}
		}
	}
}
