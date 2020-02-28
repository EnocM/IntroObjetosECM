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
public class Accesorio {
    private String nombre;
    private String fabricante;
    
public Accesorio(){}

public Accesorio(String n, String fab){
    this.nombre = n;
    this.fabricante = fab;
}

public void setNombre(String n){
    this.nombre = n;
}

public String getNombre(){
    return nombre;
}

public void setFabricante(String fab){
    this.fabricante = fab;
}

public String getFabricante(){
    return fabricante;
}


}
