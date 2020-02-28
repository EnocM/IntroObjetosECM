/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introobjetosecm;

/**
 *
 * @author alumno
 */
public class Motor {
    private int cilindrada;
    private String fabricante;
    
    public Motor(){}
    
    public Motor(int cc,String fab){
        this.cilindrada = cc;
        this.fabricante = fab;        
    }
    @Override
    public String toString(){
        String res = "";
        res= "Fabricante : "+this.fabricante+"\n";
        res+= "Cilindrada: " +this.cilindrada+"\t";
        return res;
    }
    
    
    public void setFabricante(String fab){
        this.fabricante = fab;
    }
    
    public void setCilindrada(int cc){
        this.cilindrada = cc;
    }
    
    public String getFabricante(){
        return fabricante;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    public void apagar(){}

    public void encender(){}
    
}