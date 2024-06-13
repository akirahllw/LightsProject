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

    @Override
    public void isWorking(){
        System.out.println("The light is shining with " + getColor() + " color\n Current settings of the light: ");
        System.out.println("Power: " + getPower() + "\nBrightness: " + getBrightness());
        System.out.println("Flashing: " + (isFlashing? "Yes" : "No"));
    }
}
