package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.modeles;

import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.StatJoueur;

import java.util.Collection;

public interface IServiceStat {
    public Collection<StatJoueur> getClassement(Collection<StatJoueur> listStatJoueur);
    public void PrintTop3(Collection<StatJoueur> listStatJoueur);
}
