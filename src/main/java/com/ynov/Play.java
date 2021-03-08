package com.ynov;

import com.ynov.cards.CarteCouleur;
import com.ynov.cards.Guerrier;
import com.ynov.cards.Soigneur;
import com.ynov.cards.Terrain;

// Le main du programme
public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terrain ynov = new Terrain(CarteCouleur.B);//Terrain à la couleur blanche
		Guerrier w1 = new Guerrier("Brutus", 50, 100);//nom Brutus cout 50 et degat 100
		Soigneur h1 = new Soigneur("Dr-AveCesar", "Chirugien", 10);//Nom AveCesar cout 10 explication de son metier Chirugien

		Jeu jeu = new Jeu(2);

		
	}

}
