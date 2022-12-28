import org.eric.classe.Ennemi;
import org.eric.classe.Personnage;

public class Main {
    public static void main(String[] args) {
        Personnage object = Personnage.getInstance();
        object.showMessage();
        System.out.println(Ennemi.laListeEnemies());
    }
}