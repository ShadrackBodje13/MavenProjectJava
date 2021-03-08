package com.ynov.cards;
//De person dependra le soigneur et le guerrier 
public abstract class Person extends Cartes {
	
//	Attribut 
	private String nom;//Toute personne a un nom quand bien meme elle ait un type guerrier ou docteur
	
//	Contructeur
	public Person(String nom, int cout) {//cout de vient de cartes
		super(cout);//il prend le cout de la classe Cartes
		this.nom = nom;//le nom private
	}
	
	
//	Methode
	//Surcharger ensuite pour chaque type de cartes une méthode toString() qui retournera son type, son coût et la valeur
	//de ses arguments spécifiques.
	@Override
	public String toString() {
		return super.toString() + " - nom du personnage : " + nom;
	}
	
	

}
