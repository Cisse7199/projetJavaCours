import java.util.Scanner;

public class paiementMatierePremiere {

    //Declaration des variables
    String etatPaiement;

    //Declaration de attributs :

    private int numeroPaiement=001234;
    private String dateDePaiement="11/10/2024";
    private boolean validationPaiement=false;

   public paiementMatierePremiere(){}

   public void infosPaiementMatiere(){
       System.out.println("---informations de paiement de la matiere premiere :");
       System.out.println("Numero de paiement :"+numeroPaiement+"");
       System.out.println("Date du paiement :"+dateDePaiement+"");
       System.out.println("Validation du paiement :"+validationPaiement+"\n");
   }
    //Declaration des methodes :

    public void validationPaiement(){
        System.out.println("Le paiement est t il valder ?(oui ou non)");
        Scanner paievalid=new Scanner(System.in);
        String validPaiement=paievalid.nextLine();

        if(validPaiement=="oui") {
            validationPaiement = true;
            etatPaiement = "Paiement valider";
            System.out.println("Etat de paiement de la matiere remiere" + etatPaiement + "\n Le processus de transformation continue");
        }
        if(etatPaiement=="Paiement valider"){
            System.out.println("On passe a l etape suivante de production \n, l etape de paiement est valider");
        }
    }
}
