package mypackage;
import mypackage.Montre;

class Personne{
    String nom;
    Montre Pmontre;
    Personne(String nom){
        this.nom = nom;
        this.Pmontre = null;
    }

    void porteMontre( Montre m){
        if(this.Pmontre == null){

            this.Pmontre = m;
            System.out.println("Montre mise pour: "+ this.nom);
        }
        else {
            System.out.println("La personne a déjà une montre");
        }
    }

    void enleveMontre(){
        if (this.Pmontre != null){
            this.Pmontre = null;
            System.out.println("Montre retiré");
        }

        else{
            System.out.println("il n'y avait pas de montre ");
        }
    }

    void donneHeure(){
        if(this.Pmontre != null) {
            System.out.println("L'heure est la suivante: " + this.Pmontre.heure +"h" + this.Pmontre.min );

        }
        else {
            System.out.println("Je suis désolé mais je n'ai pas de montre");
        }
    }

    void demanderHeure(Personne p){
        p.donneHeure();
    }

}