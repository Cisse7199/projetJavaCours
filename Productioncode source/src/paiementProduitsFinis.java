import java.util.Scanner;

public class paiementProduitsFinis {
    //Declaration des attributs:

    public int numeropaiementProduit;
    public String datePaiement;
     int nombreLotsProduitspayes=0;


    //Construction de la classe :
    public paiementProduitsFinis(int numeropaiementProduit, String datePaiement){
        this.numeropaiementProduit=numeropaiementProduit;
        this.datePaiement=datePaiement;
    }

    public void payerProduit(){

            System.out.println("Produit payer par le client ");
            nombreLotsProduitspayes += 1;
            System.out.println("Nombre de lots payes :"+nombreLotsProduitspayes+"\n");

        }

        public void confirmerPaiement(){
            //Recupere l avis de l utilisateur pour confirmer son paiement
            System.out.println("Voulez vous confirmer votre paiement cher client ;");
            Scanner Sc = new Scanner(System.in);
            String avis=Sc.nextLine();

            if(avis == "1" ){
                System.out.println("Ok Paiement valider par le client");
            }
            else {
                System.out.println("Vous n avez pas encore payer ce produit");
            }

        }

    public void affichagepaiement(){
        System.out.println("Numero de paiement :"+numeropaiementProduit+"\n");
        System.out.println("Date de Paiement  :"+datePaiement+"\n");
    }

    //Declration de la methode :


}
