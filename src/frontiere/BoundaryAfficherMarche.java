package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfoMarche();
		if (infosMarche.length ==0) {
			System.out.println("le marché est vide, revenez plus tard.");
		}else {
			StringBuilder message = new StringBuilder();
			for ( int i =  0 ; i < infosMarche.length ; i++) {
				
			}
			}
		}
}
