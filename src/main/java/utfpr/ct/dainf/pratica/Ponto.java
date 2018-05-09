package utfpr.ct.dainf.pratica;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ponto {
    
    private double x, y, z;
    
    public Ponto(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public Ponto(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    protected String getNome() {
        return getClass().getSimpleName();
    }

    protected double getX() {
        return x;
    }

    protected void setX(double x) {
        this.x = x;
    }

    protected double getY() {
        return y;
    }

    
    protected void setY(double y) {
        this.y = y;
    }

    protected double getZ() {
        return z;
    }

    protected void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public String toString(){
        //nome-da-classe(x,y,z)
        String res = this.getNome()+"("+this.getX()+","+this.getY()+","+this.getZ()+")";
        return res;
    }
    
    public double dist(Ponto p){
        double difx = this.getX()-p.getX();
        double dify = this.getY()-p.getY();
        double difz = this.getZ()-p.getZ();
        
        double dist = sqrt(  pow(difx, 2) + pow(dify, 2) + pow(difz, 2)  );
        return dist;
    }
}
