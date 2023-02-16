package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.modeles;

import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.JoueurDTO;
import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.StatJoueur;

import java.util.Collection;
import java.util.Set;

public interface IServiceJoueur {
    public Set<JoueurDTO> listerJoueurs();
    public String getInfoJoueur(String pseudo);
    public void gestionScoreJoueur(JoueurDTO joueur, int value);
    public StatJoueur getStatJoueur(JoueurDTO joueur);
    public Collection<JoueurDTO> getClassement();
    public void addJoueur(JoueurDTO joueur);
    public void deleteJoueur(JoueurDTO joueur);
    public JoueurDTO createJoueur();
}
