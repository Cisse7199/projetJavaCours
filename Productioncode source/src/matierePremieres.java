//Declaration de la classe
public class matierePremieres {
    //Declaration des attributs et variables

    //Declaration des variables
    private String commande="Non";
    private String transform="oui";
    private String dateReception;

    //declaration des attributs

    public int nouvelleQuantiter;
    public int quantiteCommander;
    protected boolean validationPaiement=true;
    public int quantiteMinimaleStock=25;
    protected int quantiteTotaleDisponible;
    protected  int quantiteInitiale;;
    protected int quantiteRestante;

//Creation du constructeur pas surcharge
    public matierePremieres(String commande){
        this.commande=commande;
    }

    //Creation des differents methodes avec leurs contenus
    public void commander( boolean ValidationPaiement){
        if (validationPaiement==true){
            System.out.println("La commande des matieres est lancee");
             commande="oui";

        }
        else{
            System.out.println("La commande des matieres n est pas encore lance, donc production en attente");
        }
    }

    public void creerStockmatierePremiere(){
        if (commande=="oui"){
            System.out.println("Le stock est creer pour les diffferents matieres");
            transform="oui";
        }
        else{
            System.out.println("Pas de stock pour le moment");

        }
    }
    public void transformer(String transform){
        if(transform=="oui"){
            System.out.println(("La transformation a debuter"));
        }
        else{
            System.out.println("Pas de transformation pour le moment");
        }
    }
    public void reduireQuantite(String transform){
        if (transform=="oui"){
            System.out.println("La quantite initiale est reduite pour etre transforme");
        }
        else{
            System.out.println("La quantite de stock reste la meme car il n y a pas eu de transformation");
        }
    }
    public void nouvelleQuantiter(){
        nouvelleQuantiter=quantiteCommander+quantiteMinimaleStock;
        System.out.println("La nouvelle quantite est de :"+nouvelleQuantiter+"tonnes");
    }
    public int quantitetotale(int nouvelleQuantite, int quantiteMinimaleStock){
        return quantitetotale(nouvelleQuantite, quantiteMinimaleStock);}
}
