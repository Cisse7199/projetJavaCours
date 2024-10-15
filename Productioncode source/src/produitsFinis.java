import java.util.Scanner;

public class produitsFinis {
    //Declaration des attributs :

    private int numeroproduit;
    private String dateFabrication;
    private String dateExpiration;
    private int nombreLotsUtilise;
    private int quantiteproduite;

    //Construction de la classe :

    public produitsFinis(int numeroproduit, String dateFabrication, String dateExpiration, int nombreLotsUtilise, int quantiteproduite) {
        this.numeroproduit = numeroproduit;
        this.dateFabrication = dateFabrication;
        this.dateExpiration = dateExpiration;
        this.nombreLotsUtilise = nombreLotsUtilise;
        this.quantiteproduite = quantiteproduite;

    }

    //Description du produit realiser :
    public void infosProduit() {
        System.out.println("----Informations de chaque produit fabrique :----");
        System.out.println("numero du produit :" + numeroproduit + "");
        System.out.println("Date de fabrication :" + dateFabrication + "");
        System.out.println("Date d´expiration  :" + dateExpiration + "");
        System.out.println("Nombre de lots utilise  :" + nombreLotsUtilise + "");
        System.out.println("Quantite produite  :" + quantiteproduite + "\n");
    }

    //Methodes de la classe :

    public void verifierProduit() {
        System.out.println("--Etape de verification du produit--");
        System.out.println("Produits a verifier par une organisation dans ce domaine ");
        System.out.println("Les produits fabriques sont ils verifies \n1-Oui \2-Non\nEcrire '1' ou '2'");
        Scanner verifp = new Scanner(System.in);
        String verifProduit = verifp.nextLine();

        if (verifProduit =="1") {
            System.out.println("Le produit peut etre commercialise car il repond aux normes");
        } else {
            System.out.println("Readaptation du produit car ne respectant pas les normes, \n donc peut pas etre commercialise");
        }

    }
}
