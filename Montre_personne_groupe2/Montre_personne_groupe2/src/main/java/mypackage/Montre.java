package mypackage;
import mypackage.Personne;

class Montre {
    int heure, min;
    Personne p;

    Montre(int h, int m) {
        this.heure = h;
        this.min = m;
    }

    Montre(Montre m) {
        this.heure = m.heure;
        this.min = m.min;
    }

    void avance() {
//        if (this.min == 59) {
//            if (this.heure == 23) this.heure = 0;
//            else this.heure = this.heure++;
//            this.min = 0;
//        } else this.min++;
        System.out.println("L'heure actuelle est la suivante: "+this.heure+"h "+this.min);
        if (this.heure < 24 && this.min < 60) {
            this.min++;
        }
    }
}