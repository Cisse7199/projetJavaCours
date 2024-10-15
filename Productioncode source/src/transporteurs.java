public class transporteurs {

    //Declaration attributs :
    private int idTransporteur;
    private  String nomTransporteur;
    private  String prenomTransporteur;

    //Construction de la classe :
    public transporteurs(int idTransporteur,String nomTransporteur,String prenomTransporteur){
        this.idTransporteur=idTransporteur;
        this.nomTransporteur=nomTransporteur;
        this.prenomTransporteur=prenomTransporteur;
    }

    //Affichage infos transporteur :
    public void affichageInfostransporteurs(){
        //Variable transport
        String Transport = "il est charger de transporter les produits fabriquers pour les grands \n magasins et les cliens";

        //Affichage des infos et role du transporteur dans la production:
        System.out.println("Le transporteur :");
        System.out.println("Identifiant du transporteur  :"+idTransporteur+"");
        System.out.println("Nom du transporteur:"+nomTransporteur+"");
        System.out.println("Prenom du transporteur:"+prenomTransporteur+"");
        System.out.println("Role du transporteur:"+Transport+"");
    }


}
