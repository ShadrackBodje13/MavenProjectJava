package com.ynov.cards;
// C'est une classe (Abstract) qui est forc�e une classe � agir de facon restricitve
public abstract class Cartes implements ICarte {
	
	//Attribut
	//De plus, chaque carte, ind�pendamment de son type, poss�de un co�t. 
	private int cout;
	
	//Constructor
	public Cartes(int cout) {
		this.cout = cout;
		System.out.println(this.getClass().getSimpleName());
	}
	
	//Methode
	//Surcharger ensuite pour chaque type de cartes une m�thode toString() qui retournera son type, son co�t et la valeur
		//de ses arguments sp�cifiques.
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " -  cout : " + cout;
	}
}
