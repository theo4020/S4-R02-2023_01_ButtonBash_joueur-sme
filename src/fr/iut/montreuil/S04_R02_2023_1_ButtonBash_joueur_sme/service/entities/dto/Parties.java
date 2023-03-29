package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto;

import java.util.LinkedList;

public class Parties {
    private int nbQuestion;
    private int nbBonneReponse;
    private int tempsPartie;
    private LinkedList<Parties> list5LastParties = new LinkedList<Parties>();

    public Parties() {
        this.nbQuestion = 0;
        this.nbBonneReponse = 0;
        this.tempsPartie = 0;
    }

    public int getNbQuestion() {
        return nbQuestion;
    }

    public void setNbQuestion(int nbQuestion) {
        this.nbQuestion = nbQuestion;
    }

    public int getNbBonneReponse() {
        return nbBonneReponse;
    }

    public void setNbBonneReponse(int nbBonneReponse) {
        this.nbBonneReponse = nbBonneReponse;
    }

    public int getTempsPartie() {
        return tempsPartie;
    }

    public void setTempsPartie(int tempsPartie) {
        this.tempsPartie = tempsPartie;
    }

    public LinkedList<Parties> getListParties() {
        return list5LastParties;
    }

    public void addPartie(Parties partie) {
        if (list5LastParties.size() == 5) {
            list5LastParties.removeLast();
        }
        list5LastParties.add(partie);
    }


}
