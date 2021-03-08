package com.ynov.cards;

public class Guerrier extends Person {
//Attibut
	//Les guerriers poss�dent un nom, un nombre de points de d�g�ts et un nombre de points de vie.
	//De plus, chaque carte, ind�pendamment de son type, poss�de un co�t. Celui d'un terrain est 0. Le guerrier vaut 50 et
	//le soigneur 10.
	
	private int degat;
	private int vie;
	
//Contrructeur
	public Guerrier(String nom, int degat, int vie) {
		super(nom, 50);//il prend nom et cout de person
		this.degat = degat;
		this.vie = vie;
	}
	
//MEthodes, toutes les classes ont la methode to string
	//Surcharger ensuite pour chaque type de cartes une m�thode toString() qui retournera son type, son co�t et la valeur
	//de ses arguments sp�cifiques.
	@Override
	public String toString() {
		return super.toString() + " - d�gats : " + degat + " - vie : " + vie;
	}
	
}
