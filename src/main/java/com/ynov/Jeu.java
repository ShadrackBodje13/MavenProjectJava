package com.ynov;

import com.ynov.cards.*;

//Créez de plus une classe Jeu pour représenter un jeu de cartes
public class Jeu {
	
// Attribbut
	//En attribut, un tableau d’objets représentant les cartes sera implémenté. 
	private Cartes carteJoueur[];
	
	//Implémenter également le getter de cet attribut.
	public Cartes[] getCarteJoueur() {//Getter
		return carteJoueur;
	}
	
// Constructeur
	//En paramètre du constructeur, fournir le nombre maximal de cartes pour le jeu
	public Jeu(int maxiCartes) {
		carteJoueur = new Cartes[maxiCartes];
	}
	
// Methode
	//Cette classe devra avoir une méthode piocher prenant en paramètre une carte. La méthode ajoutera la carte au tableau de cartes
	//Si jamais, le tableau de carte a atteint sa limite maximal, la méthode piocher doit retourner une exception avec le texte « Jeu de cartes FULL ».
	
	public void Piocher (Cartes carte) throws Exception {
		boolean full = true;//Peut-etre un boléen
	}
	
	//Le Jeu comportera également une méthode jouer permettra de jouer une carte. 
	public void jouer() {
			for(int i=0; i < carteJoueur.length; i++) {//Parcourt le tableau des cartes que le joueur a 
				// on jouera les cartes  dans l'ordre où elles sont stockées dans le jeu,  
				if(carteJoueur[i] != null) {//la carte n'est pas encore jouée donc elle n'est pas mise null
					System.out.println("Je joue une carte "); //On affichera également le texte « Je joue une carte … ».
					System.out.println(carteJoueur[i]);//La courte jouée
					carteJoueur[i] = null; //et on mettra la carte jouée à null dans le tableau de cartes.
					break;
				}
			}
		}
	
	

