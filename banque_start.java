import java.util.*;

public class banque_start {
    public static void main(String[] arg) {

        // Déclarations des données
        String TypeCpt = "Courant", Theme = "Loyer", MoyenPaie = "CB";
        long cptdata, NumCpt = '0';
        int Choix;
        float ValeurOp = 1400, Taux = 10;
        Date Date;

        boolean doitOnReafficherLeMenu = true; // Boolean permettant de réafficher le menu
        Scanner LectureClavier = new Scanner(System.in);

        while (doitOnReafficherLeMenu == true) {
            // Affichage menu + choix de l'option
            System.out.println("1. Creer un compte");
            System.out.println("2. Afficher un compte");
            System.out.println("3. Creer une ligne comptable");
            System.out.println("4. Sortir");
            System.out.println("5. De l'aide");
            System.out.println("Votre choix : ");
            
            Choix = LectureClavier.nextInt();
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
                    doitOnReafficherLeMenu = true;
                    break;

                case 2:
                    doitOnReafficherLeMenu = false;
                    System.out.println("Compte à consulter : ");
                    cptdata = LectureClavier.nextLong();
                    if (cptdata == NumCpt) {
                        System.out.println("Numéro du compte ouvert : " + NumCpt);
                        System.out.println("Type de compte : " + TypeCpt);
                        System.out.println("Valeur initiale : " + ValeurOp);
                    } else {
                        System.out.println("Ce compte n'existe pas !");

                    }
                    break;

                case 3:
                    System.out.println("Option 3 : Option non programmée ");
                    doitOnReafficherLeMenu = true;
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
                    doitOnReafficherLeMenu = true;
                    break;

                default:
                    System.out.println("Nique ton choix de con");
                    doitOnReafficherLeMenu = false;
                    break;
            }
        }

        LectureClavier.close();
    }
}