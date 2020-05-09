package aula;

public class Main {
	public static void main(String[] args) {
		int idade = 29; 
		System.out.println("Hello, World");
		System.out.println("Minha idade é " +idade);
		idade = 30;
		System.out.println("Minha idade é " +idade);
		System.out.println("Minha idade é " +(idade+1));
		
		//Tipos de variaveis
		int numero = 3000; 
		String frase = "Olá mundo!"; 
		boolean var = true; 
		char var2 = 'a'; 
		double var3 = 24.9; 
		
		System.out.println(numero); 
		System.out.println(frase);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);

		//constantes
		
		final int vida_maxima = 10; 
		System.out.println(vida_maxima); 
		
		//Arrays
		String[] nome = new String[5]; 
		nome[0] = "Guilherme"; 
		nome[1] = "João";
		System.out.println(nome[0]);
		System.out.println(nome[1]);
		
		String[][] nome2 = new String[5][5]; 
		nome2[0][0] = "Felipe";
		System.out.println(nome2[0][0]);
	}

}
