package fr.tetiana.casino;

import com.airtel.Encaissement;
import com.orange.EncaissementOrange;

public class Main {

	public static void main(String[] args) {		
		
		//  -----------------  1. Creer un caisse -----------------  
		Caisse caisse1 = new Caisse(); 
		
//		final String ANSI_RESET = "\u001B[0m";
//		final String ANSI_RED = "\u001B[31m"; 
//		
//		System.out.println(ANSI_RED + "caisse" + ANSI_RESET); 
		Out.r("         __________________________________________");
		Out.r(" *** |||                                            |||");
		Out.r(" *** |||                    Caisse                  |||");
		Out.r(" *** ||| __________________________________________ |||");
		Out.rc("\nSasissez votre montant : ");
		
		//
		double montant2 = Out.rDouble();
		
		// Pour la classe CAISSE
		caisse1.setMontantCaisse(montant2);

		Out.r("\nConfirmé !! Maintenent caisse a: " + montant2 + " euros.");
		Out.r("");
		Out.r("");
		
		
		// ----------------- 2. Creer Transaction  -----------------
		Transaction tr1 = new Transaction();		
 
		Out.r("         __________________________________________");
		Out.r(" *** |||                                            |||");
		Out.r(" *** |||                  Tansaction                |||");
		Out.r(" *** ||| __________________________________________ |||\n");
		
		Out.rc("\nEst-ce que vous voulez effectuer une transaction?\n1-Oui\n2-non\nVotre choix: ");
		int choix = Out.rInt();
		if (choix == 1) {
			
			// montant
			Out.r("\n\n_______________ Montant ______________\n");	
			Out.rc("Entrez le montant de votre transaction : ");
			double montantTransaction1 = Out.rDouble();
			tr1.setMontantTransaction(montantTransaction1);
			Out.r("Confirmé !!  Votre montant : " + montantTransaction1 + " est enregistré!");	
		
	
			// moyant de payement
			Out.r("\n\n__________ Moyant de payement ________\n");	
			Out.r("Entrez le type moyant de payement:");
			Out.r("1 - Espece");
			Out.r("2 - Airtel moyen de paiement");
			Out.r("3 - Orange Money");
			Out.r("4 - MTN Money");				
			
			Out.rc("Votre moyant de payement : ");	
			int moyant = Out.rInt();
			Out.rc("\nConfirmé !! Votre moyant est ");
			switch(moyant) {
				case 1 :
					Out.r("Espece");
					tr1.setMoyantPayement("Espece.\n");
					caisse1.setMontantCaisse(caisse1.getMontantCaisse() + tr1.getMontantTransaction());
					break;
					
					
					
					
				case 2 :
					Out.r("Airtel moyen de paiement.\n");
					tr1.setMoyantPayement("Airtel moyen de paiement");
					
					// FAWAZ a créé une class Encaissement 
					Encaissement en = new Encaissement();
					en.effectuerDepot(montantTransaction1);
					// --!
					
					break;
					
					
					
					
					
				case 3 :
					Out.r(" Orange Money.");
					tr1.setMoyantPayement("Orange Money\n");
					
					// MAXIME a créé une class Encaissement 
					EncaissementOrange enOrange = new EncaissementOrange();
					enOrange.effectuerdepot(montantTransaction1);
					// --!
					
					break;
					
					
					
					
					
				case 4 :
					Out.r("MTN Money.");	
					tr1.setMoyantPayement("MTN Money\n");
					
					break;
					
					
					
					
				default:
					Out.r("Error! Tapez 1 ou 2 ou 3 ou 4.");
					
					
					
					
			}			
			 
			
		} else {
			Out.r("A bientot !");
		}
	}

}
