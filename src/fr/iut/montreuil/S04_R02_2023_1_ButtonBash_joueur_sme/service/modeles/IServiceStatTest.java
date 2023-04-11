import fr.iut.montreuil.S04_R02_2023_1_ButtonBash_joueur_sme.service.entities.dto.StatJoueur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ServiceStatTest {

    @Mock
    private StatJoueur joueur1;

    @Mock
    private StatJoueur joueur2;

    @Mock
    private StatJoueur joueur3;

    @Mock
    private StatJoueur joueur4;

    @Mock
    private StatJoueur joueur5;

    private ServiceStat serviceStat;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        serviceStat = new ServiceStat();
    }

    @Test
    void testGetClassement() {
        List<StatJoueur> listStatJoueur = new ArrayList<>();
        listStatJoueur.add(joueur1);
        listStatJoueur.add(joueur2);
        listStatJoueur.add(joueur3);
        listStatJoueur.add(joueur4);
        listStatJoueur.add(joueur5);

        when(joueur1.getNbBonneReponse()).thenReturn(2);
        when(joueur2.getNbBonneReponse()).thenReturn(5);
        when(joueur3.getNbBonneReponse()).thenReturn(3);
        when(joueur4.getNbBonneReponse()).thenReturn(1);
        when(joueur5.getNbBonneReponse()).thenReturn(4);

        Collection<StatJoueur> expectedClassement = new ArrayList<>();
        expectedClassement.add(joueur2);
        expectedClassement.add(joueur5);
        expectedClassement.add(joueur3);
        expectedClassement.add(joueur1);
        expectedClassement.add(joueur4);

        Collection<StatJoueur> actualClassement = serviceStat.getClassement(listStatJoueur);

        assertEquals(expectedClassement.size(), actualClassement.size());
        assertEquals(expectedClassement, actualClassement);
    }

    @Test
    void testPrintTop3() {
        List<StatJoueur> listStatJoueur = new ArrayList<>();
        listStatJoueur.add(joueur1);
        listStatJoueur.add(joueur2);
        listStatJoueur.add(joueur3);
        listStatJoueur.add(joueur4);
        listStatJoueur.add(joueur5);

        when(joueur1.getNbBonneReponse()).thenReturn(2);
        when(joueur1.getNom()).thenReturn("Joueur 1");
        when(joueur2.getNbBonneReponse()).thenReturn(5);
        when(joueur2.getNom()).thenReturn("Joueur 2");
        when(joueur3.getNbBonneReponse()).thenReturn(3);
        when(joueur3.getNom()).thenReturn("Joueur 3");
        when(joueur4.getNbBonneReponse()).thenReturn(1);
        when(joueur4.getNom()).thenReturn("Joueur 4");
        when(joueur5.getNbBonneReponse()).thenReturn(4);
        when(joueur5.getNom()).thenReturn("Joueur 5");

        String expectedOutput = "Top 3 :\n" +
                "1. Joueur 2 - 5 bonnes réponses\n" +
                "2. Joueur 5 - 4 bonnes réponses\n" +
                "3. Joueur 3 - 3 bonnes réponses\n";

        assertEquals(expectedOutput, serviceStat.PrintTop3(listStatJoueur));
    }
}
