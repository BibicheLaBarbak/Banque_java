import java.util.*;

public class banque_start {
    public static void main(String[] arg) {

        // Déclarations des données
        String TypeCpt, Theme, MoyenPaie, NumCpt;
        int Choix;
        float ValeurOp, Taux;
        Date Date;

        // Affichage menu + choix de l'option
        System.out.println("1. Creer un compte");
        System.out.println("2. Afficher un compte");
        System.out.println("3. Creer une ligne comptable");
        System.out.println("4. Sortir");
        System.out.println("5. De l'aide");
        Scanner LectureClavier = new Scanner(System.in);
        System.out.println("Votre choix : ");
        Choix = LectureClavier.nextInt();

        // Affichage du menu des options
        if (Choix == 1) {
            System.out.println("Option 1");
            System.out.println("Type du compte [Types possibles : courant, joint, épargne] : ");
            TypeCpt = LectureClavier.next();
            System.out.println("Numero du compte : ");
            NumCpt = LectureClavier.next();
            System.out.println("Première valeur créditée : ");
            ValeurOp = LectureClavier.nextFloat();
            System.out.println("Taux de placement : ");
            Taux = LectureClavier.nextFloat();

        } else if (Choix == 2) {
            System.out.println("Compte à consulter : ");
            NumCpt = LectureClavier.next();

        } else if (Choix == 3) {
            System.out.println("Option 3 : Option non programmée ");

        } else if (Choix == 4) {
            System.exit(0);

        } else if (Choix == 5) {
            System.out.println("L'option 1 vous permet de creer un compte en choisissant son type, son numero et sa premiere valeur");
            System.out.println("L'option 2 vous permet de consulter un compte déjà existant");
            System.out.println("L'option 3 n'est pas encore programmée");
            System.out.println("L'option 4 vous permet de fermer l'application");
        }

        LectureClavier.close();
    }
}
