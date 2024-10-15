public class ouvriers {

    //Declaration des methodes :

    private int idOuvrier;
    private String nomOuvrier;
    private String prenomOuvrier;
    private String effectuerTaches;
    private String recevoirSalaire;
    private String sousContrat;

    //constructeur de la classe :
    public ouvriers(int idOuvrier, String nomOuvrier, String prenomOuvrier){
        this.idOuvrier=idOuvrier;
        this.nomOuvrier=nomOuvrier;
        this.prenomOuvrier=prenomOuvrier;
    }

    //Description des ouvriers :
    public void setOuvrier(){
        effectuerTaches="Taches commandes par les techniciens";//Taches a effectuer : A declarer dans l affichage
        sousContrat="Contrat en cours";//Etat du contrat: A declarer dans l affichage
        recevoirSalaire="Salaire mensuel pour le travail";//Etat du payement :A declarer dans l affichage

        //Affichage infosOuvriers :
        System.out.println("---------Description des ouvriers--------- :");
        System.out.println("Identifiant de l ouvrier  :"+idOuvrier+"");
        System.out.println("Nom de l ouvrier :"+nomOuvrier+"");
        System.out.println("Prenom de l oivrier :"+prenomOuvrier+"");
        System.out.println("Taches effectuer  :"+effectuerTaches+"");
        System.out.println("Salaire  :"+recevoirSalaire+"");
        System.out.println("Etat du contrat de travail :"+sousContrat+"\n");


    }

}
