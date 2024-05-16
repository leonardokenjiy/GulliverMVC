package Restaurantes;

import java.util.Scanner;
import java.util.HashMap;

public class GulliverTraveller {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashMap<String, String> restaurante = new HashMap<>();
		HashMap<String, String> localizacao = new HashMap<>();
		HashMap<String, String> avaliacoes = new HashMap<>();
		
		restaurante.put("1", "Mcdonalds");
		restaurante.put("2", "Burguer King");
		
		localizacao.put("1", "Avenida Brasil");
		localizacao.put("2", "Paulista");
		
		avaliacoes.put("1", "Gulliver");
		avaliacoes.put("2", "Joao");
		
		System.out.println("restaurantes: " + restaurante);
		System.out.println("localizacao: " + localizacao);
		System.out.println("avaliacoes: " + avaliacoes);
		
		
	}
	

}
