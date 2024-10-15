public class comptable {
    //declaration des attributs :

    private int identifiantComptable=00112;
    private String nomComptable="Ouedraogo";
    private String prenomComptable="Toto";


    //Declaration des methopdes :

    public comptable() {
        this.identifiantComptable=identifiantComptable;
        this.nomComptable=nomComptable;
        this.prenomComptable=prenomComptable;

    }

    //Affichage infos du comptable :

    public  void infosComptable() {

        System.out.println("Identifiant :"+identifiantComptable);
        System.out.println("Nom:"+nomComptable);
        System.out.println("Identifiant :"+prenomComptable+"\n");
    }
    public void compteRendu(){
        System.out.println("Compte renu en fin de semaine ");
        System.out.println("Etat : Realiser ");
        System.out.println("Etat du budget :Budget suffisant pour la realisation");
        }
    }
    

