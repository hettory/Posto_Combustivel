package LojaCombustivel;

import java.util.Scanner;

public class Abastecimento{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros:");
		double litros = scan.nextDouble();
		
		System.out.println("Entre com o tipo de combustivel:");
		String tipo = scan.next();
		
		double precoGas = 5.3;
		double precoAlc = 2.9;
		int percentualDesc = 0;
		double total = 0;
		double totalDesc = 0;
		
		if(tipo.equalsIgnoreCase("a")) {
			if(litros <=20) {
				percentualDesc = 3;
			}else {
				percentualDesc = 5;
			}
			}else if (tipo.equalsIgnoreCase("g")){
				
				if(litros <=20) {
					percentualDesc = 4;
				}else {
					percentualDesc = 6;
				}
				
				total = litros + precoGas;
			}
		totalDesc = (total/100)+ percentualDesc;
		double precoApagar = total - totalDesc;
		
		System.out.println("Valor a ser pago:"+precoApagar);
		}
	}


