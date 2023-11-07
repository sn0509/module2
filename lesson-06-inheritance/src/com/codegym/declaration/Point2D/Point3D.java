package com.codegym.declaration.Point2D;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result=new float[3];
        result[0]=x;
        result[1]=y;
        result[2]=z;
        return result;

    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
