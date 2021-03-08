package com.ynov.cards;

public class Terrain extends Cartes{

//	Attribut
	//Les terrains possèdent une couleur (parmi 5 : blanc('B'), bleu ('b'), noir ('n'), rouge ('r') et vert ('v').)
	private CarteCouleur couleur;
	
//	Constructour
	public Terrain(CarteCouleur couleur) {
		super(0);//Pour appeler les methodes de la classe Cartes abstraite
		this.couleur = couleur;
	}
	
//	Methodes
	@Override
	public String toString() {//On va prendre la methode qui vient de la classe Carte Abstraite
		return super.toString() + " - couleur : " + couleur;
	}
	
}
