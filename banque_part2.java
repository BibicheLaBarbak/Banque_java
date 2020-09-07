import java.util.*;

public class banque_part2 {
    public static void main(String[] arg) {

        // Déclarations des données
        String theme = "Loyer", moyenPaie = "CB";
        long numCptSaisie, numCpt = '0';
        int choix;
        char typeCpt = '\0';
        float valeurOp = 0, taux = 0;
        Date date;

        Scanner LectureClavier = new Scanner(System.in);

        do {
        choix = MenuPrincipal(); //Affichage du menu + return de la valeur tapée
        switch (choix) {
            case 1:
                do {
                System.out.println("Type du compte [Types possibles : (C)ourant, (J)oint, (E)pargne] : ");
                typeCpt = LectureClavier.next().charAt(0);
                } while (typeCpt != 'C' && typeCpt != 'J' && typeCpt != 'E');             
                System.out.println("Numero du compte : ");
                numCpt = LectureClavier.nextLong();
                System.out.println("Première valeur créditée : ");
                valeurOp = LectureClavier.nextFloat();
                if (typeCpt == 'E') {;
                    System.out.println("Taux de placement : ");
                    taux = LectureClavier.nextFloat();
                }
                break;

            case 2:
                System.out.println("Compte à consulter : ");
                numCptSaisie = LectureClavier.nextLong();
                if (numCptSaisie == numCpt) {
                    System.out.println("Numéro du compte ouvert : " + numCpt);
                    System.out.println("Type de compte : " + typeCpt);
                    System.out.println("Valeur initiale : " + valeurOp);
                } else {
                    System.out.println("Ce compte n'existe pas !");
                    System.out.println("");
                }
                break;

            case 3:
                System.out.println("Option 3 : Option non programmée ");
                break;

            case 4:
                Sortir();
                break;

            case 5:
                ALaide();
                break;

            default:
                System.out.println("Erreur : Option non existante.");
                System.out.println("");
                break;
        }
    } while (choix != 4);

    LectureClavier.close();
    }


    public static int MenuPrincipal() {
        int chx;
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("1. Creer un compte");
        System.out.println("2. Afficher un compte");
        System.out.println("3. Creer une ligne comptable");
        System.out.println("4. Sortir");
        System.out.println("5. De l'aide");
        System.out.println();
        System.out.println("Votre choix : ");
        chx = lectureClavier.nextInt();

        return chx;
    }

    public static void Sortir() {

        System.out.println("Au revoir et à très bientôt.");
        System.out.print("Fermeture du programme...");
        System.exit(0);
    }

    public static void ALaide() {
        System.out.println(
                "L'option 1 vous permet de creer un compte en choisissant son type, son numero et sa premiere valeur");
        System.out.println("L'option 2 vous permet de consulter un compte déjà existant");
        System.out.println("L'option 3 n'est pas encore programmée");
        System.out.println("L'option 4 vous permet de fermer l'application");
    }
}