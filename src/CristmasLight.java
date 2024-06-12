public class CristmasLight extends Light{
    private boolean isFlashing;
    public CristmasLight(double power, double brightness, String turnOn, String color, boolean isFlashing) {
        super(power, brightness, turnOn, color);
        this.isFlashing = isFlashing;
    }

    public boolean isFlashing(){
        return isFlashing;
    }

    public void setIsFlashing(boolean isFlashing){
        this.isFlashing = isFlashing;
    }

    @Override
    public boolean canChangeColor(){
        return true;
    }
}
