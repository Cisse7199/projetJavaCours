
//Creation de la classe
public class Lots extends matierePremieres{

    //Declaration des attributs
    private int numeroLot=122;
    private int poidsLot=140;
    private String dateTransformationlots="13/10/2024";



    public Lots(String commandes){
        super(commandes);
    }
   //Affichage infoslots
    /*public  void infoslots(){
        System.out.println("Les informations du lots prelever sont :\n");
        System.out.println("Numero du Lot :"+numeroLot+"\n");
        System.out.println("poids du Lot :"+poidsLot+"\n");
        System.out.println("Date de transformation du lot :"+dateTransformationlots+"\n");
    }*/

    //Declaration de la methode
    public void prelevementDeLots(){
        System.out.println("Par la suite , il faut prelever les lots\n de matieres premieres pour transformer");
        if(quantiteTotaleDisponible > quantiteMinimaleStock && quantiteRestante <  nouvelleQuantiter ){
            System.out.println("Lots prelever pour la transformation \n");
            System.out.println("Les informations du lots prelever sont :");
            System.out.println("Numero du Lot :"+numeroLot+"");
            System.out.println("poids du Lot :"+poidsLot+"");
            System.out.println("Date de transformation du lot :"+dateTransformationlots+"\n");


        }
        else{
            System.out.println("Il n y a pas eu de prelevement pour le moment");
        }
    }
}

