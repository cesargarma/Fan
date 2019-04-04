package consola;

import dam.Velocidad;

public class PruebasEnum {
    public static void main(String[] args) {

        System.out.println("Velocidades:");
        for(Velocidad vel: Velocidad.values()) {
            System.out.println("Speed: "+vel);
            System.out.println("Position: "+vel.ordinal());
            System.out.println("prueba");
        }
    }
}
