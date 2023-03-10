package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.impl;

import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.JoueurDTO;
import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.StatJoueur;
import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.modeles.IServiceJoueur;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ServiceJoueur implements IServiceJoueur {
    private Set<JoueurDTO> listeJoueurs;

    public ServiceJoueur() {
        listeJoueurs = new HashSet<>();
    }

    @Override
    public Set<JoueurDTO> listerJoueurs() {
        return listerJoueurs();
    }

    @Override
    public void addJoueur(JoueurDTO joueur) {
        listeJoueurs.add(joueur);
    }

    @Override
    public String getInfoJoueur(String pseudo) {
        JoueurDTO joueur = listeJoueurs.stream().filter(j -> j.getPseudo().equals(pseudo)).findFirst().orElse(null);
        if (joueur == null) {
            return null;
        }
        return joueur.toString();
    }

    @Override
    public void gestionScoreJoueur(JoueurDTO joueur, int value) {
        joueur.setScore(joueur.getScore() + value);
    }

    @Override
    public void deleteJoueur(JoueurDTO joueur) {

    }

    @Override
    public JoueurDTO createJoueur() {
        return null;
    }

    @Override
    public StatJoueur getStatJoueur(JoueurDTO joueur) {
        return null;
    }

    @Override
    public Collection<JoueurDTO> getClassement() {
        return null;
    }
}
