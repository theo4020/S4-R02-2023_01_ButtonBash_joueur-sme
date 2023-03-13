package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.impl;

import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.JoueurDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ServiceJoueurTest {



    private ServiceJoueur service;
    private Set<JoueurDTO> listeJoueurs;

    @BeforeEach
    void setUp() {
        service = new ServiceJoueur();
        listeJoueurs = new HashSet<>();
        JoueurDTO joueur1 = new JoueurDTO("Alice");
        JoueurDTO joueur2 = new JoueurDTO("Bob");
        listeJoueurs.add(joueur1);
        listeJoueurs.add(joueur2);
        service.setListeJoueurs(listeJoueurs);
    }

    @Test
    void testAddJoueur() {
        JoueurDTO joueur = new JoueurDTO("Charles");
        service.addJoueur(joueur);
        assertTrue(listeJoueurs.contains(joueur));
    }

    @org.junit.jupiter.api.Test
    void getInfoJoueur() {
    }

    @org.junit.jupiter.api.Test
    void gestionScoreJoueur() {
    }

    @BeforeEach
    void setUpDelete() {
        service = new ServiceJoueur();
        listeJoueurs = new HashSet<>();
        JoueurDTO joueur1 = new JoueurDTO("Alice");
        JoueurDTO joueur2 = new JoueurDTO("Bob");
        listeJoueurs.add(joueur1);
        listeJoueurs.add(joueur2);
        service.setListeJoueurs(listeJoueurs);
    }

    @Test
    void testDeleteJoueur() {
        JoueurDTO joueur = new JoueurDTO("Alice");
        service.deleteJoueur(joueur);
        assertFalse(listeJoueurs.contains(joueur));
    }

    @org.junit.jupiter.api.Test
    void createJoueur() {
    }

    @org.junit.jupiter.api.Test
    void getStatJoueur() {
    }

    @org.junit.jupiter.api.Test
    void getClassement() {
    }
}