public class RoomLight extends Light{
    private double temperature;
    public RoomLight(double power, double brightness, String turnOn, String color, double temperature) {
        super(power, brightness, turnOn, color);
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setIsFlashing(boolean isFlashing){
        this.temperature = temperature;
    }

    @Override
    public boolean canChangeTemperature(){
        return true;
    }
}
