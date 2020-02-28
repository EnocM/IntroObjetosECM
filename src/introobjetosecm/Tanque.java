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
public class Tanque {
    private int capacidad;
    private String tipoCombustible;
    
public Tanque(){}

public Tanque(int cap, String tipoComb){
    this.capacidad = cap;
    this.tipoCombustible = tipoComb;
}

public void setCapacidad (int cap){
    this.capacidad = cap;
}

public void setTipoCombustible(String tipo){
    this.tipoCombustible=tipo;
}

public int getCapacidad (){
    return capacidad;
}

public String getTipoCombustible(){
    return tipoCombustible;
}


}
