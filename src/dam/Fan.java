package dam;

public class Fan {
    private Speed speed = Speed.MEDIUM;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan(){}

    ///////////
    //GETTERS//
    ///////////
    public Speed getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\nSPEED: "+speed+"\nPOWER: "+on+"\nRADIUS: "+ radius +"\nCOLOR: "+color;
    }
}