/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Moniteur extends Plongeur {

    public int numeroDiplome;
    public ArrayList<Embauche> emplois;

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, GroupeSanguin amoins, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    /**
     * Si ce moniteur n'a pas d'embauche, ou si sa dernière embauche est terminée,
     * ce moniteur n'a pas d'employeur.
     * @return l'employeur actuel de ce moniteur sous la forme d'un Optional
     */
    public Optional<Club> employeurActuel() {

        for(int i = emplois.size()-1; i>0; i--){
            if(this.emplois.get(i).getDebut().isBefore(LocalDate.now()))
            {
                if(!this.emplois.get(i).estTerminee())
                {
                    return Optional.of(this.emplois.get(i).getEmployeur());
                }
            }
        }
        return Optional.empty();
    }
    
    /**
     * Enregistrer une nouvelle embauche pour cet employeur
     * @param employeur le club employeur
     * @param debutNouvelle la date de début de l'embauche
     */
    public void nouvelleEmbauche(Club employeur, LocalDate debutNouvelle) {   
       Embauche E = new Embauche (debutNouvelle,this ,employeur);
        emplois.add(E);
    }

    public List<Embauche> emplois() {
        return emplois;
        }

public void terminerEmbauche(LocalDate fin){
    int index = emplois.size();
    Embauche derniereEmbauche =  emplois.get(index-1);
    derniereEmbauche.terminer(fin);
}


}


