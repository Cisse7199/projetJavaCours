import java.security.PublicKey;

public class clients {

    //Declaration des variables :

     int nombreLotsProduitsPayes=0;
     String appreciationProduits;

    //declaration des attributs

    private int numeroPiece;
    public   String nom;
    private  String prenom;

    //Declaration des methodes :

    paiementProduitsFinis paie1=new paiementProduitsFinis(001, "10/10/2024");


        public void infosClient(int numeroPiece, String nom, String prenom){
            System.out.println("Les informations sur le client :");
            System.out.println("numero Identifiant:"+numeroPiece+"");
            System.out.println("Nom:"+nom+"");
            System.out.println("renom:"+prenom+"\n");

        }
    //Recuperation les setters :

    public void effectuerPaiement(){

    }
    public void apprecierProduit(){
        if(nombreLotsProduitsPayes > 5){
            System.out.println(nom +"apprecie les produits");
            appreciationProduits="Bien";
        }
        else{
            System.out.println(nom +" n´apprecie pas les produits");
            appreciationProduits="Pas du tout bon";
        }
    }
}
