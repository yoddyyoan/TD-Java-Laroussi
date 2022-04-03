
public class Produit {

    //attributs

    private long codeProduit;
    private String nom;
    private int qte;
    private double prix;
    private int stock;

    public Produit(long codeProduit, String nom, int qte, double prix, int stock)
    {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
        this.stock = stock;

    }

    public Produit(long codeProduit, String nom, int qte)
    {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
        this.stock = stock;

    }

    //approvisionnement
    
    public void setQtePlus(int qte)

    {
        this.qte += qte;
    }
    //retour produit

    public void setQteMoins(int qte)

    {
        this.qte -= qte;
    }

    //recevoir la quantité

    public int getQte()
    {
        return qte;
    }

    //avertissement si le stockSecu est atteint

    public void securiteQte()
    {
        if (qte <= stock)
            System.out.println("La quantité éxcède le stock de sécurité, réapprovisionnement nécessaire.");
    }
    //validation de la commande

    public boolean validation(int qte)
    {
        if(qte - qte < stock)
            return false;
        else
            return true;
    }
    //affichage de toute les données concernant un produit

    public void donneesProduit()
    {
        System.out.println(nom + qte + prix + stock + codeProduit);
    }

    

}
