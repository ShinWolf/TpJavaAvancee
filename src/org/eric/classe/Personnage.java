package org.eric.classe;

public class Personnage {

    private int pv;
    private Arme arme; // Arme choisie aléatoirement dans le ficher
    private static Personnage instance = new Personnage();

    private Personnage(){
        this.pv = 200;
    }

    public static Personnage getInstance() {
        return instance;
    }
    public  void showMessage() {
        System.out.println("Les pv du personnage : " + this.pv);
    }
}
