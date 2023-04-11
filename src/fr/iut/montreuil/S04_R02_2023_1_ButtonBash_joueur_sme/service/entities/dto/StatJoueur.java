package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto;

public class StatJoueur {
    private int nbPartie;
    private int nbBonneReponse;
    private int nbQuestionRepondu;
    private Parties parties;

    public StatJoueur (){
        nbPartie = 0;
        nbBonneReponse = 0;
        nbQuestionRepondu = 0;
        parties = new Parties();
    }

    public int getNbPartie() {
        return nbPartie;
    }

    public void addNbPartie() {
        this.nbPartie++;
    }

    public int getNbBonneReponse() {
        return nbBonneReponse;
    }

    public void addNbBonneReponse(int nbBonneReponse) {
        this.nbBonneReponse += nbBonneReponse;
    }

    public int getNbQuestionRepondu() {
        return nbQuestionRepondu;
    }

    public void addNbQuestionRepondu(int nbQuestionRepondu) {
        this.nbQuestionRepondu += nbQuestionRepondu;
    }

    public Parties getParties() {
        return parties;
    }

    public int getMoyenne(){
        return (nbBonneReponse/nbQuestionRepondu);
    }

    public int getMoyenneTemps(){
        return (parties.getTempsPartie()/nbPartie);
    }


}
