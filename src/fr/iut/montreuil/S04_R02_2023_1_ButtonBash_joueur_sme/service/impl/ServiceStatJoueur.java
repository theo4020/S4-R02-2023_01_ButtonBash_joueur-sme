package fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.impl;

import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.Parties;
import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.StatJoueur;
import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.modeles.IServiceStat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

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
    public ArrayList<StatJoueur> getTop3(Collection<StatJoueur> listStatJoueur) {
        Collection<StatJoueur> classement = getClassement(listStatJoueur);
        ArrayList<StatJoueur> top3 = new ArrayList<StatJoueur>();
        int i = 0;
        for (StatJoueur statJoueur : classement) {
            if (i < 3) {
                top3.add(statJoueur);
            }
            i++;
        }
        return top3;
    }

    public LinkedList<Parties> getListParties(Parties parties) {
        return parties.getListParties();
    }


}
