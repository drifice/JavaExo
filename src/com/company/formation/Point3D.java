package com.company.formation;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Objects.equals(getZ(), point3D.getZ());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZ());
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
}
