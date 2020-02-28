/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introobjetosecm;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Vehiculo {
    private String fabricante;
    private String matricula;
    private int anioDeFabricacion;
    private double velocidadMaxima;
    private Motor motor;
    private Tanque tanque;
    private Tanque tanque2;
    private ArrayList<Accesorio> Accesorios;                                    //La Clase Array hay que importarla
    
    public Vehiculo(){
        this.Accesorios = new ArrayList<>();
    }
    public Vehiculo(String fab,String pat, int modelo, double vel,Motor m){
        this.fabricante = fab;
        this.matricula = pat;
        this.anioDeFabricacion = modelo;
        this.velocidadMaxima = vel;
        this.motor = m;
        this.Accesorios = new ArrayList<>();
    }
    
        public Vehiculo(String fab,String pat, int modelo, double vel,Motor m,Tanque t){
        this.fabricante = fab;
        this.matricula = pat;
        this.anioDeFabricacion = modelo;
        this.velocidadMaxima = vel;
        this.motor = m;
        this.tanque = t;
        this.Accesorios = new ArrayList<>();
    }
    
    public void setMarca(String fab){
        this.fabricante = fab;
    }
        
    public void setPatente(String mat) {
        this.matricula = mat;
    }
    
    public void setAnioDeFabricacion(int anio){
        this.anioDeFabricacion = anio;
    }
    
    public void setVelocidadMaxina(double max){
        this.velocidadMaxima = max;
    }
    
    public String getFabricante(){
        return fabricante;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public int getAnioDeFabricacion(){
        return anioDeFabricacion;
    }
    
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    public void setMotor (Motor m){
        this.motor = m;
    }
    
    public Motor getMotor(){
        return motor;
    }
    
    public void setTanque (Tanque t){
        this.tanque = t;
    }
    
    public Tanque getTanque(){
        return tanque;
    }
    
    public void setTanque2 (Tanque t){
        this.tanque2 = t;
    }
    
    public Tanque getTanque2(){
        return tanque2;
    }
    
    public void agregarAccesorio(Accesorio acc){
        this.Accesorios.add(acc);
    }
    
    public void sacarAccesorio(String nombreAcc){                               // le paso el nombre del objeto, por eso es un String
        Accesorio acc;                                                          // creo un atributo para guardar el nombre de los objeto que estoy iterando dentro de Array
        Iterator it = this.Accesorios.iterator();                               // (El Iterator hay que importarlo)
        while(it.hasNext()){                                                    // El iterador posee 4 metodos (iterator, hasnext, next y remove) que utilizo en mi estructura de repetición
            acc = (Accesorio) it.next();                                        // itAccesorio es de la clase Object lo convierto a la clase Accesorio indicando la clase entre parentesis, este proceso se llama Cast
            if (acc.getNombre() == nombreAcc){                                  // Si coincide el nombre del objeto dentro del Array con el nombre que le di como parametro...
                it.remove();                                                    // ... Lo remuevo.
            }
        }
    }
    
    public void mostrarAccesorios(){ 
        Accesorio acc;
        Iterator itAccesorio = this.Accesorios.iterator();                      
        while(itAccesorio.hasNext()){
            acc = (Accesorio) itAccesorio.next();
            System.out.println(acc.getNombre());                               
        }
    }
    
}
    

