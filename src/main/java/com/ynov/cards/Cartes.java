package com.ynov.cards;
// C'est une classe (Abstract) qui est forcée une classe à agir de facon restricitve
public abstract class Cartes implements ICarte {
	
	//Attribut
	//De plus, chaque carte, indépendamment de son type, possède un coût. 
	private int cout;
	
	//Constructor
	public Cartes(int cout) {
		this.cout = cout;
		System.out.println(this.getClass().getSimpleName());
	}
	
	//Methode
	//Surcharger ensuite pour chaque type de cartes une méthode toString() qui retournera son type, son coût et la valeur
		//de ses arguments spécifiques.
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -  cout : " + cout;
	}
}
