package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plongeur extends Personne {
    private int niveau;

    private Club clubdeplongee;
    private ArrayList<Licence> licences;

    private GroupeSanguin GS;

    public Plongeur(int niveau, ArrayList<Licence> licence, GroupeSanguin GS) {
        this.niveau = niveau;
        this.licences = licence;
        this.GS = GS;
    }
    public Plongeur(String numeroINSEE,String nom, String prenom, String adresse,String telephone, LocalDate naissance,int niveau, ArrayList<Licence> licence, GroupeSanguin GS) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
        this.licences = licence;
    }

    public Plongeur(String numeroINSEE,String nom, String prenom, String adresse,String telephone, LocalDate naissance, GroupeSanguin GS) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
        this.GS = GS;
    }

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance) {
   super (numeroINSEE, nom, prenom, adresse, telephone, naissance);
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public ArrayList<Licence>  getLicences() {
        return licences;
    }

    public void setLicences(ArrayList<Licence>  licence) {
        this.licences = licence;
    }

    public GroupeSanguin getGS() {
        return GS;
    }

    public void setGS(GroupeSanguin GS) {
        this.GS = GS;
    }

    public Club getClubdeplongee() {
        return clubdeplongee;
    }

    public void setClubdeplongee(Club clubdeplongee) {
        this.clubdeplongee = clubdeplongee;
    }

    public void ajouteLicence (String numero, LocalDate delivrance )    {
   Licence nouvelleL = new Licence(this,numero, delivrance,this.getClubdeplongee());
   licences.add(nouvelleL);
    }



    public Licence derniereLicence(){
      int index = licences.size();
      return licences.get(index-1);
    }
}

