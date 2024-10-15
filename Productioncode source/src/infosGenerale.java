import java.util.Scanner;

public class infosGenerale {

    //declaration des attributs

    private String nomEntreprise="";
    private int quantiteCommander=50;
    private int quantiteInitiale=30;
    private int nouvelleQuantiter=quantiteInitiale+quantiteCommander;


    //construction de la classe

    public infosGenerale(){}


    public void affichageInfos() {

        Scanner enterprise = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom de votre entreprise :");
        String nameEntreprise = enterprise.nextLine();
        nomEntreprise = nameEntreprise;


        System.out.println("---Etat initial de l´Etat de la production---");
        System.out.println("Nom de l´entreprise :" + nomEntreprise + "");
        System.out.println("Quantite initiale de matiere premieres :" + quantiteInitiale + "");
        System.out.println("Quantite commander de matiere premieres :" + quantiteCommander + "");
        System.out.println("Nouvelle quantite de matiere premiere:"+nouvelleQuantiter + "\n");
    }
}
