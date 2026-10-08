package controleur;

import vue.frmFormes;
import modele.Formes;

import java.util.ArrayList;

import modele.Carre;
import modele.Cercle;

public class Controle {
	
	private frmFormes frmFormes;
	private ArrayList lesFormes=new ArrayList<Formes>();
	
	
	
	
	/**
	 * Constructeur
	 * */
	
	public Controle() {
		frmFormes= new frmFormes(this);
		frmFormes.setVisible(true);
	}
	
	//methode pour recupérer les valeurs et calculé le perimetre et la surface selon la forme 
	
	public void demandeVueValeurs(String typeForme, Object valeur) {
		Formes uneForme;
		if(typeForme =="Carré") {
			uneForme= new Carre((float)valeur);
			frmFormes.afficheResultCarre(uneForme.perimetre(), uneForme.surface());
		}else{
			uneForme= new Cercle((float)valeur);
			frmFormes.afficheResultCercle(uneForme.perimetre(), uneForme.surface());
		}
		
		//ajout de la forme dans le tableau//
		lesFormes.add(uneForme);
		
		//Mise a jours de la liste//
		frmFormes.MajListe(lesFormes);
	}
	
	public void demandefrmFormesDelete(int indice) {
		//suppression dans la collection//
		lesFormes.remove(indice);
		//demande de mise a jours de la liste
		frmFormes.MajListe(lesFormes);
	}
	
		//lancement de l'app//
		public static void main(String[] args) {
			new Controle();
		}
		
	
}
