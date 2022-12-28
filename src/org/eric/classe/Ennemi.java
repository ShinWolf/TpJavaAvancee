package org.eric.classe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ennemi {

    private String nomE;
    private int pvE;
    private int minDpsE;
    private int maxDpsE;

    public Ennemi(String nomE, int pvE, int minDpsE, int maxDpsE){
        this.nomE = nomE;
        this.pvE = pvE;
        this.minDpsE = minDpsE;
        this.maxDpsE = maxDpsE;
    }

    public static List<Ennemi> laListeEnemies(){
        List<Ennemi> listeEnemie= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("ressources/enemies.txt"))){

            Pattern pattern = Pattern.compile("([\\w]+),PdV=(\\d+),Min=(\\d+),Max=(\\d+)");

            String line;

            while ((line = reader.readLine()) != null){
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()){
                    Ennemi e = new Ennemi(matcher.group(1), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)));
                    listeEnemie.add(e);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return listeEnemie;
    }

    @Override
    public String toString() {
        return "Nom:" + this.nomE + " Pv: " + this.pvE + " MinDps: " + this.minDpsE + " MaxDps: " + this.maxDpsE;
    }

}
