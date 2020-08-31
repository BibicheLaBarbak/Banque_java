import java.util.*;

public class banque_start {
    public static void main(String[] arg) {

        // Déclarations des données
        String TypeCpt = "Courant", Theme = "Loyer", MoyenPaie = "CB";
        long NumCpt = 250230;
        int Choix;
        float ValeurOp = 1400, Taux = 10;
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
        switch (Choix) {
            case 1:
                System.out.println("Type du compte [Types possibles : courant, joint, épargne] : ");
                    TypeCpt = LectureClavier.next();
                if (TypeCpt == "Courant" || TypeCpt == "Joint") {
                    System.out.println("Numero du compte : ");
                    NumCpt = LectureClavier.nextLong();
                    System.out.println("Première valeur créditée : ");
                    ValeurOp = LectureClavier.nextFloat();
                } else {
                    System.out.println("Numero du compte : ");
                    NumCpt = LectureClavier.nextLong();
                    System.out.println("Première valeur créditée : ");
                    ValeurOp = LectureClavier.nextFloat();
                    System.out.println("Taux de placement : ");
                    Taux = LectureClavier.nextFloat();
                }
                break;

            case 2:
                System.out.println("Compte à consulter : ");
                NumCpt = LectureClavier.nextLong();
                if (NumCpt == 250230) {
                    System.out.println("Numéro de compte ouvert : \"250230\" ");
                    System.out.println("Type de compte : " +TypeCpt);
                    System.out.println("Valeur initiale : " +ValeurOp);
                } else {
                    System.out.println("Ce compte n'existe pas !");
                }
                break;

            case 3:
                System.out.println("Option 3 : Option non programmée ");
                break;

            case 4:
                System.exit(0);
                break;

            case 5:
                System.out.println(
                        "L'option 1 vous permet de creer un compte en choisissant son type, son numero et sa premiere valeur");
                System.out.println("L'option 2 vous permet de consulter un compte déjà existant");
                System.out.println("L'option 3 n'est pas encore programmée");
                System.out.println("L'option 4 vous permet de fermer l'application");
                break;

            default:
                System.out.println("Vous n'avez sélectionné aucune des 5 options !");
                break;
        }
        LectureClavier.close();
    }
}