package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto;

public class JoueurDTO {
    private String pseudo;

    private StatJoueur statJoueur;

    public JoueurDTO(String pseudo) {
        this.pseudo = pseudo;
        this.statJoueur = new StatJoueur();



    }
    //getters and setters
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public StatJoueur getStatJoueur() {
        return statJoueur;
    }
}
