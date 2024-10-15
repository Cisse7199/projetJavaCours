import java.util.stream.DoubleStream;

public class techniciens {

    //Declaration attributs :
    private  int idTechnicien=00452;
    private String nomTechnicien="Ouedraogo";
    private String prenomTechnicien="Boubacar";


    //Construction de la classe .

    public techniciens(){
        this.idTechnicien=idTechnicien;
        this.nomTechnicien=nomTechnicien;
        this.prenomTechnicien=prenomTechnicien;
    }

    public void technicieninfos(){

        //Declaration des variables pour technicien :
        String processusFabrication="Verifier le rocessus de Fabrications,mesures et conditions de travail";
        String choixcomposant="Faire le choix des composants pour la fabrication du produit opte";
        String rapportAvancement="Rapport d avancement des travaux chaque semaine fourni a la secretaire \n et elle a son tour le passe au DG de l entreprise";

        //Affichage des informations du technicien :
        System.out.println("--Informations et roles du technicien :");
        System.out.println("Identifiant du technicien :"+idTechnicien+"");
        System.out.println("Nom du technicien  :"+nomTechnicien+"");
        System.out.println("Prenom du technicien :"+prenomTechnicien+"");
        System.out.println("Role dans le processus de fabrication :"+processusFabrication+"");
        System.out.println("Role dans le choix des composants :"+choixcomposant+"");
        System.out.println("Rapport d avancement :"+rapportAvancement+"\n");

    }
}
