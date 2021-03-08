package com.ynov.cards;

public class Guerrier extends Person {
//Attibut
	//Les guerriers possèdent un nom, un nombre de points de dégâts et un nombre de points de vie.
	//De plus, chaque carte, indépendamment de son type, possède un coût. Celui d'un terrain est 0. Le guerrier vaut 50 et
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
	//Surcharger ensuite pour chaque type de cartes une méthode toString() qui retournera son type, son coût et la valeur
	//de ses arguments spécifiques.
	@Override
	public String toString() {
		return super.toString() + " - dégats : " + degat + " - vie : " + vie;
	}
	
}
