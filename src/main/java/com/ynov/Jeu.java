package com.ynov;

import com.ynov.cards.*;

//Cr�ez de plus une classe Jeu pour repr�senter un jeu de cartes
public class Jeu {
	
// Attribbut
	//En attribut, un tableau d�objets repr�sentant les cartes sera impl�ment�. 
	private Cartes carteJoueur[];
	
	//Impl�menter �galement le getter de cet attribut.
	public Cartes[] getCarteJoueur() {//Getter
		return carteJoueur;
	}
	
// Constructeur
	//En param�tre du constructeur, fournir le nombre maximal de cartes pour le jeu
	public Jeu(int maxiCartes) {
		carteJoueur = new Cartes[maxiCartes];
	}
	
// Methode
	//Cette classe devra avoir une m�thode piocher prenant en param�tre une carte. La m�thode ajoutera la carte au tableau de cartes
	//Si jamais, le tableau de carte a atteint sa limite maximal, la m�thode piocher doit retourner une exception avec le texte � Jeu de cartes FULL �.
	
	public void Piocher (Cartes carte) throws Exception {
		boolean full = true;//Peut-etre un bol�en
	}
	
	//Le Jeu comportera �galement une m�thode jouer permettra de jouer une carte. 
	public void jouer() {
			for(int i=0; i < carteJoueur.length; i++) {//Parcourt le tableau des cartes que le joueur a 
				// on jouera les cartes  dans l'ordre o� elles sont stock�es dans le jeu,  
				if(carteJoueur[i] != null) {//la carte n'est pas encore jou�e donc elle n'est pas mise null
					System.out.println("Je joue une carte "); //On affichera �galement le texte � Je joue une carte � �.
					System.out.println(carteJoueur[i]);//La courte jou�e
					carteJoueur[i] = null; //et on mettra la carte jou�e � null dans le tableau de cartes.
					break;
				}
			}
		}
	
	

