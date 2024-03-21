package controleur;

import villagegaulois.Etal;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer

	/**
	 * 
	 * @param produit
	 * @return donneesEtal est un tableau de chaine contenant
	 * 		[0] : un boolean indiquant si l'étal est occupé
	 * 		[1] : nom du vendeur
	 * 		[2] : produit vendu
	 * 		[3] : quantité de produit à vendre au début du marché
	 * 		[4] : quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		boolean etalOccupe = etal.isEtalOccupe();
		String produit = etal.getProduit();
		int quantiteInitial = etal.getQuantiteDebutMarche();
		int quantiteVendu = quantiteInitial - etal.getQuantite();
		String[] donneesEtal = new String[5];
		donneesEtal[0] = String.valueOf(etalOccupe);
		donneesEtal[1] = nomVendeur;
		donneesEtal[2] = produit ;
		donneesEtal[3] = String.valueOf(quantiteInitial);
		donneesEtal[4] = String.valueOf(quantiteVendu);
		return donneesEtal;
	}
	
	public boolean isVendeur(String nomVendeur) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		if (etal == null) {
			return false;
		}else {
			return true;
		}
		
	}

}
