public class Light {

    private double power;
    private double brightness;

    private String turnOn;
    private String color;

    public Light(double power, double brightness, String turnOn,String color ){
        this.power = power;
        this.brightness = brightness;
        this.turnOn = turnOn;
        this.color = color;
    }

    public double getPower(double power){
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public String getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(String turnOn) {
        this.turnOn = turnOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean canChangeColor(){ // I understand that we could just not use this method but I want you to see
        return false;                // that i can use override like a part of Inheritance
    }
}
