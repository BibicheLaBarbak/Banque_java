import java.util.*;

public class machineacafe {

    public static void main(String[] arg) {

        // Création programme machine à café - Comptage et affichage du nombre de pièces
        // et total

        // Annonces des variables
        int nbpieces5 = 0, nbpieces10 = 0, nbpieces20 = 0, piece;
        int totalrecu = 0;

        Scanner LectureClavier = new Scanner(System.in);
        System.out.println("Veuillez insérer 45 centimes pour un café");
        System.out.print("Machine rendant la monnaie");

        do {
            System.out.print ("Valeur de la pièce entrée : ");
            piece = LectureClavier.nextInt();
            switch (piece) {
                case 5:
                    nbpieces5 = nbpieces5 + 1;
                    break;

                case 10:
                    nbpieces10 = nbpieces10 + 1;
                    break;

                case 20:
                    nbpieces20 = nbpieces20 + 1;
                    break;

                default:
                    piece = 0;
                    System.out.println ("Pièce non acceptée");
                    break;
            }
            totalrecu = totalrecu + piece;
            System.out.println ("Vous avez entrée : ");
            System.out.println (+nbpieces5+" pièces de 5 centimes");
            System.out.println (+nbpieces10+" pièces de 10 centimes");
            System.out.println (+nbpieces20+" pièces de 20 centimes");
            System.out.println ("Soit un total de "+totalrecu+" centimes.");
        } while (totalrecu < 45);
        System.out.println("Café en cours de préparation...");
        if (totalrecu > 45)
            System.out.println("Monnaie rendue : "+ (totalrecu-45)+ " centimes.");
        System.out.println("...");
        System.out.println("Votre café est prêt !");

        LectureClavier.close();
    }
}
