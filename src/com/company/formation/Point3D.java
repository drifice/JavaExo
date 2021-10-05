package com.company.formation;

import java.util.Objects;

public class Point3D {
    private Integer z =0;
    private Point2D point2 = new Point2D();

    public Point3D() {
    }

    public Point2D getPoint2() {
        return point2;
    }

    public Point3D(Integer z) {
        this.z = z;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public void afficher() {
        System.out.println("["
                .concat(this.point2.getX().toString())
                .concat(",")
                .concat(this.point2.getY().toString())
                .concat(",")
                .concat(this.z.toString())
                .concat("]"));
    }

    public void translater(int dX, int dY, int dZ) {
        this.setZ(getZ() + dZ);
        this.point2.setX(point2.getX() + dX);
        this.point2.setY(point2.getY() + dY);
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
