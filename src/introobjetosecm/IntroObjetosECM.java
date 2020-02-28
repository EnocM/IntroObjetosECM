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
public class IntroObjetosECM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Vehiculo auto = new Vehiculo();                                             // Creamos un auto "vacio"
    auto.setAnioDeFabricacion(2015);                                            // ... y le modificamos los atributos
    auto.setPatente("AA687CD");                                                 // "
    auto.setVelocidadMaxina(220);                                               // "
    
    // También podemos crear un vehiculo con las especificaciones
    Vehiculo GT = new Vehiculo("Ford","RBU157",1977,160,new Motor(2300,"Ford"));//  Como el atributo "motor" es un objeto podemos crearlo antes o en el momento de crear el vehiculo
                                                                                
    Tanque t1 = new Tanque();                                                   // 06-08-2018
    t1.setCapacidad(65);
    t1.setTipoCombustible("Nafta");
    
    Tanque t2 = new Tanque(18,"GNC");
    GT.setTanque(t1);                                                           
                                                                                // 08-08-2018
    GT.agregarAccesorio(new Accesorio("Radio", "Sony"));                        // creo un accesorio al agregarlo
    Accesorio an = new Accesorio("Faros AntiNiebla", "Ford");                   // creo un accesorio por separado...
    GT.agregarAccesorio(an);                                                    // ... y lo agrego al auto
    GT.agregarAccesorio(new Accesorio("Llantas", "Momo"));                      
    GT.agregarAccesorio(new Accesorio("Subwoffer", "Pionner"));
    GT.agregarAccesorio(new Accesorio("Techo Vinílico", "AvanCar"));            // A pedido de Cristian le agregamos el techo vinílico
    GT.agregarAccesorio(new Accesorio("Espejo", "Fram"));
    
    GT.sacarAccesorio("Techo Vinílico");                                        //Ante acusaciones cruzadas entre Cristian y Marcelo sobre quién es "más viejo" Sacamos el techo vinílico para mantener la paz
        
    // Muestro los detalles del auto
    System.out.println("==================================================");
    System.out.println("Hemos creado un auto con los siguientes atributos:");
    System.out.println(" ");
    System.out.println("Patente: " + GT.getMatricula());
    System.out.println("Marca  : "+GT.getFabricante());
    System.out.println("Modelo : " +GT.getAnioDeFabricacion());
    System.out.println("Vel.Max: "+GT.getVelocidadMaxima());
    System.out.println("===================");
    System.out.println("Detalles del motor: ");
    System.out.println(GT.getMotor().toString());
    System.out.println("Tipo : "+GT.getTanque().getTipoCombustible());
    System.out.println("================================");
    System.out.println("Detalle de accesorios colocados:");
    GT.mostrarAccesorios();
}
}