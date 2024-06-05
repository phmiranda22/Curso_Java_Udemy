import java.util.Scanner;
import entities.Estudante;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de quantidade de estudantes que vão alugar quartos: ");
		int qnt=sc.nextInt();
		Estudante[] quartos = new Estudante[10];
		for(int i=1;i<=qnt;i++) {
			System.out.println("Estudante #"+i+" :");
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String nome=sc.nextLine();
			System.out.println("Digite o email: ");
			String email=sc.nextLine();
			System.out.println("Digite o número do quarto: ");
			int num=sc.nextInt();
			quartos[num]=new Estudante(nome,email);
			System.out.println();
		}
		System.out.println();
		System.out.println("Quartos reservados: ");
		for (int i=0;i<10;i++) {
			
			if (quartos[i] != null ) {
				System.out.println(i + ": "+quartos[i]);
			}
		}
		
		sc.close();
	}

}
