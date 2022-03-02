/*
 * 	Une application des comptes bancaires
 ✓	Permettra la création des comptes qui appartiennent a des clients
 ✓	Un client peut posséder plusieurs compte		
 ✓	Les comptes sont types (Courant et Epargne)
 ✓	Lis peuvent être de types morales (entreprise) ou  physique.
 *	Un client de TYPE MORALE :
  		doit renseigner son représentant :
  		 	qui une personne physique;
  		 	qui a un nom, 
  		 	son N° de sécurité sociale, 
  		 	le téléphone, etc.
 *	L’application doit permettre d’effectuer des versements ou des retraits
 * 	Chaque transaction doit avoir une date, une référence,  le numéro de compte concerné ainsi que le montant
 *	Lors de la  création des comptes de types d’épargne, un montant initial est requis.
    de 100 euro
 */



package fr.tetiana.banque_clientel;

public class Main {

	public static void main(String[] args) {
		new Bienvenue();
	}

}
