package com.company.formation;

public class Point3D extends Point2D{
    private Integer z =0;

    public Point3D() {
    }

    public Point3D(int x, int y, Integer z) {
        super(x, y);
        this.setZ(z);
    }


    public void afficher() {
        System.out.println("["
                .concat(getX().toString())
                .concat(",")
                .concat(getY().toString())
                .concat(",")
                .concat(this.z.toString())
                .concat("]"));
    }

    public void translater(int dX, int dY, int dZ) {
        this.setZ(getZ() + dZ);
        this.setX(getX() + dX);
        this.setY(getY() + dY);
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
}
