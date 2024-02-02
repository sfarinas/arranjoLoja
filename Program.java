package arranjoLoja;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de N");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine(); // consumir o NextInt anterior.
			System.out.println("Nome do produto");
			String name = sc.nextLine();
			System.out.println("Preço do produto");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			System.out.println();
		}
		
		// realizar a soma.
		
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		System.out.printf("soma de preço: %.2f%n" , sum);
		double media = sum / vect.length;
		
		System.out.printf("Media %.2f%n" , media);
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("======================= " + vect[i].getName() + " ======================");
			System.out.println("Nome Produto : " + vect[i].getName());
			System.out.println("Preço Produto $ " + vect[i].getPrice());
			System.out.println();
			
		}
		
		sc.close();
	}

}
