import java.util.*;

public class Statistiques {
    public static void main(String[] arg) {
        // Déclarations des variables
        int nbCB, nbCHEQUE, nbVIREMENT, nbDEBIT;
        float prctCB, prctCH, prctVI;

        // Saisie des valeurs + affichages pour la saisie
        Scanner LectureClavier = new Scanner(System.in);
        System.out.print("Nombre de paiements par Carte Bleue : ");
        nbCB = LectureClavier.nextInt();
        System.out.print("Nombre de chèques émis : ");
        nbCHEQUE = LectureClavier.nextInt();
        System.out.print("Nombre de virements émis : ");
        nbVIREMENT = LectureClavier.nextInt();

        // Calcul du nombre de débits totaux
        nbDEBIT = nbCB + nbCHEQUE + nbVIREMENT;

        // Calcul du pourcentage de chaque moyen de paiement
        prctCB = (float) /*Conversion int -> float*/ nbCB / nbDEBIT * 100; 
        prctCH = (float) nbCHEQUE / nbDEBIT * 100;
        prctVI = (float) nbVIREMENT / nbDEBIT * 100;

        // Affichage final
        System.out.println("Vous avez émis " + nbDEBIT + " ordres de débit");
        System.out.println("dont " + prctCB + " % par Carte Bleue");
        System.out.println("dont " + prctCH + " % par Chèque");
        System.out.println("dont " + prctVI + " % par Virement");
        LectureClavier.close();
    }
}
