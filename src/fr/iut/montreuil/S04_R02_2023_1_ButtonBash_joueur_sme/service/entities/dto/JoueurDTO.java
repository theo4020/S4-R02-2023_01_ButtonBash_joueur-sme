package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto;

public class JoueurDTO {
    private String pseudo;
    private int score;

    public JoueurDTO(String pseudo) {
        this.pseudo = pseudo;
    }

    //getters and setters
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
