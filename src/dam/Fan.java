package dam;

import dam.Velocidad;

public class Fan {
    private int speed = Velocidad.MEDIUM.ordinal();
    private boolean on = false;
    private double radious = 5;
    private String color = "blue";

    public Fan(){ }

    @Override
    public String toString() {
        return "\nSPEED: "+speed+"\nPOWER: "+on+"\nRADIOUS: "+radious+"\nCOLOR: "+color;
    }
}
