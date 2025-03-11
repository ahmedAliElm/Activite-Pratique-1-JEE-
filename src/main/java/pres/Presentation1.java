package pres;

import dao.Dao_Implementation;
import metier.Metier_Implementation;

public class Presentation1 {
    public static void main(String[] args) {

        System.out.println();

        Dao_Implementation d = new Dao_Implementation();

        Metier_Implementation m = new Metier_Implementation(d);

        System.out.println("Résultat: " + m.calcul());

        System.out.println();
    }
}

