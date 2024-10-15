public class Taches {

    //Declaration des attributs :

    private int idTache;
    private String typeTache;
    private  String nomTache;
    private  String dateExecution;

    //Construction de la classe :
    public Taches( int idTache, String typeTache, String nomTache, String dateExecution){
        this.idTache=idTache;
        this.typeTache=typeTache;
        this.nomTache=nomTache;
        this.dateExecution=dateExecution;
    }

    //Descriptiond de la tache :
    public void descriptionTache(){
        System.out.println("--Description detaille des taches executes pour la production-- ");
        System.out.println("Identifiant de la tache "+idTache+"");
        System.out.println("Type de la tache : "+typeTache+"");
        System.out.println("Nom de la tache :"+nomTache+"");
        System.out.println("Date d execution de la tache "+dateExecution+"\n");
    }


    //Declaration de la methode :

    public void executer(){
            String executionTaches="Taches sont executes sous la supervision et les ordres des techniciens";
    }
}
