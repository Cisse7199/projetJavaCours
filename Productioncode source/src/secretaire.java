public class secretaire {

    //Declaration des attributs :

    public   int identifiantSecretaire;
    private String nomSecretaire;
    private String prenomsecretaire;
    private String rapportHebdomadaire;
    private String rapportFinal;
    private String enregistrerInformation;


    public  secretaire(int identifiantSecretaire, String nomSecretaire, String prenomsecretaire){
        this.identifiantSecretaire=identifiantSecretaire;
        this.nomSecretaire=nomSecretaire;
        this.prenomsecretaire=prenomsecretaire;
    }

    //Affichage infos secretaire :
    public void secretaireInfos(){
        System.out.println("Informations du secretaire de l entreprise :");
        System.out.println("Identifiants du secretaire:"+identifiantSecretaire+"");
        System.out.println("Nom du secretaire :"+nomSecretaire+"");
        System.out.println("Prenom du secretaire :"+prenomsecretaire+"\n");

    }

    //Les methodes de la classe :

    public void rapport(){
        System.out.println("--Roles et taches du secretaire tout au long de la production--");
        rapportHebdomadaire="Bilan general des activites durant la semaine";
        System.out.println("Le rapport hebdomadaire :"+rapportHebdomadaire+"");

        enregistrerInformation="Enregistrer la planification des taches";
        System.out.println("Stockage des informations :"+enregistrerInformation+"");

        rapportFinal="Bilan complet de tout le processus de production";
        System.out.println("Le rapport final :"+rapportFinal+"\n");
    }

}
