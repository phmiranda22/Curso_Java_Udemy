package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.println("Quantos empregados iremos registrar? ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Empregado "+ (i+1) + " :");
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o Id: ");
			Integer id = sc.nextInt();
			System.out.println("Digite o salario: ");
			Double salario = sc.nextDouble();
			
			Empregado emp = new Empregado(nome,id,salario);
			
			list.add(emp);
		}
		System.out.println("Id do empregado que tera salario aumentado: ");
		int idprocurado = sc.nextInt();
		Integer posicao = temId(list,idprocurado);
		if(posicao==null) {
			System.out.println("Empregado não cadastrado!");
		}
		else {
			System.out.println("Digite o percentual de aumento: ");
			double percentualAumento=sc.nextDouble();
			
			list.get(posicao).aumentoSalarial(percentualAumento);
		}
		
		for(Empregado emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer temId(List<Empregado>list, int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
}
