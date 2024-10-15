public class fournisseur {

    //Declaration des attributs :

    private int numeroPiece;//objet :fournisseur1, fournisseur 2 avec leur numero de pieces
    private String nomFournisseur;
    private String prenomfournisseur;
    private String localiteFournisseur;
    private String fournirMatierePremiere="";
    private String dateDeLivraison="14/10/2024";
    private String roleFournisseur="Fournir les matieres premieres demandes pour la production";
    private String etapeIntervention="Cela intervient en debut de production en entreprise";

    //Declaration des variables
    int nouvelleQuantiter;
    int quantiterInitiale;


    //Construction de la classe :
    public fournisseur(int numeroPiece,String nomFournisseur,String prenom, String localiteFournisseur){
        this.numeroPiece=numeroPiece;
        this.nomFournisseur=nomFournisseur;
        this.prenomfournisseur=prenom;
        this.localiteFournisseur=localiteFournisseur;
    }

    //Informations sur la livraison et le fournisseur
    public void infosFournisseur(){
        System.out.println("Le fournisseur des matieres premieres et les details de la livraison :");
        System.out.println("Numero du fournisseur :"+numeroPiece+"");
        System.out.println("Nom du fournisseur :"+nomFournisseur+"");
        System.out.println("Prenom du fournisseur :"+prenomfournisseur+"");
        System.out.println("Localite du fournisseur :"+localiteFournisseur+"");
        System.out.println("Date de livraison :"+dateDeLivraison+"");
        System.out.println("Role du fournissur :"+roleFournisseur+"");
        System.out.println("Etape d intervention dans la production :"+etapeIntervention+"\n");
    }

    //Declaration des methodes :

    public  void fournirMatiere(int nouvelleQuantiter,int quantiterInitiale){
        if(nouvelleQuantiter > quantiterInitiale){
            System.out.println("Matier premiere bien fourni");
            fournirMatierePremiere="OUI";

        }
        else{
            System.out.println("Matiere premiere non fourni : \nDifficile de continuer le processus car on a besoin \n de matieres premieres pour continuer");
            fournirMatierePremiere="NON";
        }
    }
    

}
