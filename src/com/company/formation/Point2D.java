package com.company.formation;

public class Point2D {

    private int x = 0;
    private int y = 0;

    public Point2D() {
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("[" + this.x + "," + this.y + "]");
    }

    public void translater(int dX, int dY) {
        this.x+=dX;
        this.y+=dY;
    }
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
