package com.company.formation;

public class Main {

    public static void main(String[] args) {
        Point2D Point = new Point2D(2,8);
        Point.afficher();

        int dX = 0;
        int dY = 8;

        Point.translater(dX,dY);
        Point.afficher();
    }
}
