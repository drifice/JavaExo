package com.company.formation;

public class Point2D {
    private static Integer compteur =0;
    private Integer x;
    private Integer y;

    public Point2D() {
        this.compteur ++;
        this.setX(0);
        this.setY(0);
    }

    public Point2D(int x, int y) {
        this.compteur ++;
        this.setX(x);
        this.setY(y);
    }

    /**
     * permet d'afficher le point
     */
    public void afficher() {
        System.out.println("["
                .concat(this.x.toString())
                .concat(",")
                .concat(this.y.toString())
                .concat("]"));
    }

    /**
     * permet de recalculer  x et y
     * @param dX
     * @param dY
     */
    public void translater(int dX, int dY) {

        this.setX(getX() + dX);
        this.setY(getY() + dY);
    }
    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public static Integer getCompteur() {
        return compteur;
    }

}
