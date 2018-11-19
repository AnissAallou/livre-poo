package book;

import java.util.Scanner;

public class TestLivre {
	
	public static void main(String[] args) {
		Livre[] livres = new Livre[3];
		Scanner sc = null; 
		System.out.println("Combien de livres à gérer ? ");
		for (int i = 0; i < livres.length; i++) {
			sc = new Scanner(System.in);
			System.out.print("Donner le titre du livre numéro " + (i + 1) + " :");
			String titre = sc.nextLine();
			System.out.print("Donner l'auteur du livre numéro " + (i + 1) + " :");
			String auteur = sc.nextLine();
			System.out.print("Donner le prix du livre numéro " + (i + 1) + " :");
			int prix = sc.nextInt();
			// instanciation de la classeLivre qui prend comme arguments titre, auteur, prix
			livres[i] = new Livre(titre, auteur, prix);
		}
		sc.close();
		for (Livre l : livres) {
			System.out.println(l);
		}
 
		System.out.println("Le nombre de livres est : " + Livre.count);
	}

}
