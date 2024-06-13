public class RoomLight extends Light{
    private double temperature;
    public RoomLight(double power, double brightness, String turnOn, String color, double temperature) {
        super(power, brightness, turnOn, color);
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    @Override
    public void isWorking(){
        System.out.println("The light is shining with " + getColor() + " color\n Current settings of the light: ");
        System.out.println("Power: " + getPower() + "\nBrightness: " + getBrightness());
        System.out.println("Temperature: " + temperature);
    }
}
