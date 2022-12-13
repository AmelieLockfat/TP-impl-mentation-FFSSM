package FFSSM;

import java.time.LocalDate;

public class Plongeur extends Personne {
    private int niveau;
    private Licence licence;
    private GroupeSanguin GS;

    public Plongeur(int niveau, Licence licence, GroupeSanguin GS) {
        this.niveau = niveau;
        this.licence = licence;
        this.GS = GS;
    }
    public Plongeur(String numeroINSEE,String nom, String prenom, String adresse,String telephone, LocalDate naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
        this.licence = licence;
    }
    public Plongeur(String numeroINSEE,String nom, String prenom, String adresse,String telephone, LocalDate naissance, GroupeSanguin GS) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
        this.licence = licence;
        this.GS = GS;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Licence getLicence() {
        return licence;
    }

    public void setLicence(Licence licence) {
        this.licence = licence;
    }

    public GroupeSanguin getGS() {
        return GS;
    }

    public void setGS(GroupeSanguin GS) {
        this.GS = GS;
    }

    public void ajouteLicence (String numero, LocalDate delivrance, Club c )    {
    licence.setNumero(numero);
    licence.setDelivrance(delivrance);
    licence.setClub(c);
    }


}

