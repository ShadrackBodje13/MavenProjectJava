package com.ynov.cards;

public class Soigneur extends Person {
//Attribut
	//Les soigneurs poss�dent un nom, un nombre de points de soin et une explication sous forme de texte. Une attaque
	//suffit � mettre hors de jeu un soigneur, ils n�ont donc pas de points de vie.
	
	private int soin;
	private String explication;
	
// Constructer
	public Soigneur(String nom, String explication, int soin) {
		super(nom, 10);//Nom et soin
		this.soin = soin;
		this.explication = explication;
	}
	
	
//Methode
	//Surcharger ensuite pour chaque type de cartes une m�thode toString() qui retournera son type, son co�t et la valeur
		//de ses arguments sp�cifiques.
	@Override
	public String toString() {
		return super.toString() + " - soin : " + soin + " - explication : " + explication;
	}
	
}
