package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.impl;

import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.Parties;
import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.StatJoueur;
import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.modeles.IServiceStat;

import java.util.Collection;
import java.util.LinkedList;

public class ServiceStatJoueur implements IServiceStat {

    @Override
    public Collection<StatJoueur> getClassement(Collection<StatJoueur> listStatJoueur) {
        Collection<StatJoueur> classement = null;
        StatJoueur smallest = null;
        while (classement.size() != listStatJoueur.size()) {
            for (StatJoueur statJoueur : listStatJoueur) {
                if (smallest == null) {
                    smallest = statJoueur;
                } else if (statJoueur.getNbBonneReponse() < smallest.getNbBonneReponse()) {
                    smallest = statJoueur;
                }
            }
            classement.add(smallest);
        }
        return classement;
    }

    @Override
    public void PrintTop3(Collection<StatJoueur> listStatJoueur) {
        Collection<StatJoueur> classement = getClassement(listStatJoueur);
        int i = 0;
        for (StatJoueur statJoueur : classement) {
            if (i < 3) {
                System.out.println(statJoueur.toString());
            }
            i++;
        }
    }

    public LinkedList<Parties> getListParties(Parties parties) {
        return parties.getListParties();
    }


}
