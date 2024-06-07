public class Light {

    private double power;
    private double brightness;

    private boolean turnOn;
    private String color;

    public Light(double power, double brightness, boolean turnOn,String color ){
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

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}