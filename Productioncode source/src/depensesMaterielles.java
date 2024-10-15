public class depensesMaterielles {

    //Declaration des attributs;
    private int idDepense;
    private String typeDepense;
    private  int  sommeDepense;
    private  String natureDepense;
    private String DateDeLaDepense;

    //Construction de la classe :

    //Construction de la classe :

    public depensesMaterielles(int idDepense,String typeDepense,int sommeDepense,String natureDepense,String DateDeLaDepense){
        this.idDepense=idDepense;
        this.typeDepense=typeDepense;
        this.sommeDepense=sommeDepense;
        this.natureDepense=natureDepense;
        this.DateDeLaDepense=DateDeLaDepense;
    }

    public void depenser(){
        System.out.println("Identifiants de la depense"+idDepense);
        System.out.println("type de la depense"+typeDepense);
        System.out.println("somme de la depense"+sommeDepense);
        System.out.println("Nature de la depense"+natureDepense);
        System.out.println("Date de la depense"+DateDeLaDepense+"\n");

    }
}
