import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //Declaration du titre du projet
        System.out.println("***************************************************");
        System.out.println("   CYCLE DE TRANSFORMATION ET DE PRODUCTION");
        System.out.println("***************************************************\n\n");

        //Instancier les objets

        matierePremieres matierePremieres1=new matierePremieres("En attente de commande");
        matierePremieres1.nouvelleQuantiter= matierePremieres1.quantiteCommander+ matierePremieres1.quantiteInitiale;
        matierePremieres1.quantiteCommander=50;
        matierePremieres1.quantiteInitiale=30;


        //Demande a l utilisateur d entrer le nom de son utilisateur
        Scanner Sc = new Scanner(System.in);
        System.out.println("Veuillez entrer Votre nom et prenom :");
        String nomEntreprise=Sc.nextLine();


        //Etat initial du bilan du processus de fabrication
        //Instancier la classe infosGenerale :
        infosGenerale infosGenerale1=new infosGenerale();
        infosGenerale1.affichageInfos();

        //Instanciation des differents classes;
        matierePremieres object=new matierePremieres("Non");
        secretaire secretaire1=new secretaire(00425,"Zoungrana","Toto");


        //Depense materielles :
        //Construcion d un objet Depense n°1 :

        depensesMaterielles depense1=new depensesMaterielles(00113,"Materielles de productions et des machines",5000000,"Depense en moyens de production","12/10/2024");
        depense1.depenser();

        //Information et methode du comptable
        comptable comptable1= new comptable();
        comptable1.infosComptable();
        comptable1.compteRendu();

        //Fournisseur matierespremieres :

        fournisseur fournisseur1=new fournisseur(444,"Ouedraogo","Madi","Ouagadougou");
        fournisseur1.infosFournisseur();
        fournisseur1.fournirMatiere(125,75);



        //Bilan des personnels :
        System.out.println("Bilan du secretaire n°1 :\n");
        System.out.println("Identifiant :"+secretaire1.identifiantSecretaire+"\n");

        //Appel de la fonction secretaire
        secretaire1.secretaireInfos();
        secretaire1.rapport();

        //Appel de la fonction commander (lance ou non)
        object.commander(true);
        object.nouvelleQuantiter();

        //Recevoir la commande :Appel des methodes
        commandes commande1=new commandes(423,"13/10/2024","Commandes de matiere pemieres avec livraison",200);
        commande1.recevoirCommande();
        commande1.verifierCommande();

        //PaiementMatieresPremieres .
        paiementMatierePremiere paiement11=new paiementMatierePremiere();
        paiement11.infosPaiementMatiere();
        paiement11.validationPaiement();

        //Appel des fonctions de matieres premieres :
        matierePremieres1.creerStockmatierePremiere();
        matierePremieres1.transformer("oui");
        matierePremieres1.reduireQuantite("oui");
        matierePremieres1.nouvelleQuantiter();
        

        //Appels aux informations du client :

        //Instancier un objet client
        clients client1 = new clients();

        //Appels des methodes clients
        client1.infosClient(00221,"Ouedraogo", "Ali");
        client1.effectuerPaiement();
        client1.apprecierProduit();

        //Techniciens
        //instanciation de la classe :
        techniciens technicien1=new techniciens();
        technicien1.technicieninfos();

        //Ouvriers
        //Instancier la classe
        ouvriers ouvrier1=new ouvriers(499,"Zongo","Charles");
        ouvrier1.setOuvrier();


        //Taches a effectuer
        //Instancier l objet de la classe :
        Taches tache1=new Taches(00275,"Taches quotidiennes indiques","Ecraser la matiere premiere","11/10/2024");
        tache1.descriptionTache();
        tache1.executer();

        //Produits finis
        //Instancier la classe
        produitsFinis produit1=new produitsFinis(0045,"15/10/2024","16/10/2026",25,30);
        produit1.infosProduit();
        produit1.verifierProduit();

        //PaiementProduitsfinis
        paiementProduitsFinis produitsFinis1= new paiementProduitsFinis(0044,"12/10/2024");
        produitsFinis1.confirmerPaiement();
        produitsFinis1.affichagepaiement();
        produitsFinis1.payerProduit();


        //Transporteurs
        //Construction de l objet :
        transporteurs transporteur1 = new transporteurs(492,"KABORE","Mahoumoudou");

        //Appel des methodes de transporteurs :
        transporteur1.affichageInfostransporteurs();
    

    }
}