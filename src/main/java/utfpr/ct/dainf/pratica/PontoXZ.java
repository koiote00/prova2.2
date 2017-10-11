/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author Residente
 */
public class PontoXZ extends Ponto2D{
    
    public PontoXZ(){
        super();
    }
    
    public PontoXZ(double x, double z){
        super(x, 0, z);
    }
    
    @Override
    public String toString(){
        //nome-da-classe(x,y,z)
        String res = this.getNome()+"("+this.getX()+","+this.getZ()+")";
        return res;
    }
    
}
