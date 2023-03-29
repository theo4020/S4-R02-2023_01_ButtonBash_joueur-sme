package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto;

public class StatJoueur {
    private int score;
    public StatJoueur (){
        score = 0;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void addScore(int score) {
        this.score += score;
    }


}
