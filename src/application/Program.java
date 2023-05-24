package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("QUANTOS CONTRIBUINTES VOCÊ VAI DIGITAR? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("DIGITE OS DADOS DO " + (i + 1) + "º CONTRIBUINTE: ");
			System.out.print("RENDA ANUAL COM SALARIO: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("RENDA ANUAL COM PRESTACAO DE SERVIÇOS: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("RENDA ANUAL COM GANHO DE CAPITAL: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("GASTOS MÉDICOS: ");
			double healthSpending = sc.nextDouble();
			System.out.print("GASTOS EDUCACIONAIS: ");
			double educationSpending = sc.nextDouble();
			
			list.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
		}
		
		int i = 1;
		for (TaxPayer payer : list) {
			System.out.println();
			System.out.println("RESUMO DO " + i + "º CONTRIBUINTE:");
			System.out.println(payer);
			i++;
		}
		
		sc.close();
	}

}