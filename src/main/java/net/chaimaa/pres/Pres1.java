package net.chaimaa.pres;

import net.chaimaa.dao.DaoImpl;
import net.chaimaa.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(dao);// Injection des dépendances via le setter
        System.out.println("RES= "+ metier.calcul());
    }
}
