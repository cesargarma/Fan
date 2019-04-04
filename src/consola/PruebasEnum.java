package consola;

import dam.Speed;

public class PruebasEnum {
    public static void main(String[] args) {

        System.out.println("Velocidades:");
        for(Speed vel: Speed.values()) {
            System.out.println("Speed: "+vel);
            System.out.println("Position: "+vel.ordinal());
        }
    }
}
