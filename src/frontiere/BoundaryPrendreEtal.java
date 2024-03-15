package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!nomVendeurConnu) {
			System.out.println("Je suis désolée "+ nomVendeur +" mais il faut être un habitant de notre village pour commencer ici");
		}else {
			System.out.println("Bonjour "+ nomVendeur+ " ,je vais regarder si je peux vous trouver un étal");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if (!etalDisponible) {
				System.out.println("Désolé "+ nomVendeur+" je n'ai plus d'étal qui ne soit pas déjà occupé");
			}else {
				installerVendeur(nomVendeur);
			}
		}
		
		
		
	}

	private void installerVendeur(String nomVendeur) {
		StringBuilder message = new StringBuilder();
		message.append("C'est parfait, il me rest un étal pour vous ! \n");
		message.append("Il me faudrait quelques renseignements : \n");
		System.out.println(message.toString());
		
		String produit = Clavier.entrerChaine("Quel produit souhaitez-vous vendre?");
		int nbproduit = Clavier.entrerEntier("Combien souhaitez-vous en vendre?");
		int numeroEtal =controlPrendreEtal.prendreEtal(nomVendeur, produit, nbproduit);
		 if (numeroEtal != -1) {
			 System.out.println("Le vendeur "+ nomVendeur +" s'est installée à l'étal n° "+ numeroEtal);
		 }
		
		
	}
}
