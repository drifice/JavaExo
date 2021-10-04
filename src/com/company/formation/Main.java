package com.company.formation;

public class Main {

    public static void main(String[] args) {
        Point2D point = new Point2D(2, 8);
        System.out.println("Il y a " + point.getCompteur().toString() + " objet point");
        Point2D point2 = new Point2D();
        System.out.println("Il y a " + point2.getCompteur().toString() + " objet point");

        point.getCompteur();
    }
}
