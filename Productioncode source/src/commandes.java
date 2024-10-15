import java.util.Scanner;

public class commandes {

    //Declaration des variables :
    String commandeRecu="";
    private String verification="";
    //Declaration des attributs :

    private  int numeroCommande;
    private String dateCommande;
    private String typeCommande; //commande de matierepremiere ou des Materielsou autres
    private int quantiteCommande;


    //Constructeur de la clase :

    public commandes(int numeroCommande,String dateCommande, String typeCommande, int quantiteCommande) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.typeCommande = typeCommande;
        this.quantiteCommande = quantiteCommande;
    }

        //Methode de bilan en general :


        //Declaration des methodes :
        public void recevoirCommande(){
            System.out.println("Numero de la commande :"+numeroCommande);
            System.out.println("Date de la commande :"+dateCommande);
            System.out.println("type  de la commande :"+typeCommande);
            System.out.println("Quantite de la commande :"+quantiteCommande+"\n");
        }

        //Verification de la commande recu :
        public void verifierCommande(){
            System.out.println("Pour l etape suivante de la production\n les matieres pemieres doivent etre verifies s ils repondent aux normes et sont complets ");
            System.out.println("Les matieres sont ils verifies ?(1-oui ou 2-Non\nChoisir '1' ou '2'");
            Scanner verif=new Scanner(System.in);
            String validVerifier=verif.nextLine();
            verification=validVerifier;
             if(verification=="1"){
                 System.out.println("Verification fait:Processus continue...");
             }
             else{
                 System.out.println("Pas  verifier:\nIl faudra que les matieres soient verifies pour continuer le processus ");
             }
        }

}
