package com.company.formation;

public class Main {

    public static void main(String[] args) {
        Point3D point = new Point3D(1,2,3);
        point.afficher();
        point.translater(1,2,3);
        point.afficher();
    }
}
