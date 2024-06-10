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

    public String isTurnOn() {
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
    public boolean canChangeColor(){
        return false;
    }
}
