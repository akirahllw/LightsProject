import java.util.Scanner;

public class RemoteControl {
    Scanner scanner = new Scanner(System.in);
    private boolean stop = false;
    Light l1 = new Light(5, 5, "Off", "White");
    CristmasLight c1 = new CristmasLight(5, 5, "Off", "White", false);
    RoomLight r1 = new RoomLight(5, 5, "Off", "White", 10);

    public void controlLoop() {
        while (!stop) {
            System.out.println("Do you want to apply any changes? (y/n) : ");
            char dis = scanner.next().charAt(0);

            if (dis == 'n')
                stop = true;
            else if(dis == 'y'){
                System.out.println("Which one of the lights do you want to use? regular (l)ight, (c)ristmas light," +
                        "(r)oom light : ");
                char light = scanner.next().charAt(0);
                switch (light) {
                    case 'l':

                        System.out.println("Which component do you want  to change? (p)ower, (b)rightness" +
                                " (t)urnOn/Off, (c)olor : ");
                        char change1 = scanner.next().charAt(0);

                        switch (change1) {
                            case 'p':
                                System.out.println("Enter new power (5 - max): ");
                                double newPower = scanner.nextDouble();
                                while (newPower > 5 || newPower < 0){
                                    System.out.println("Invalid power, enter value between 0 and 5: ");
                                    newPower = scanner.nextDouble();
                                }
                                l1.setPower(newPower);
                                break;
                            case 'b':
                                System.out.println("Enter new brightness(5 - max): ");
                                double newBrightness = scanner.nextDouble();
                                while (newBrightness >5 || newBrightness < 0){
                                    System.out.println("Invalid brightness, enter value between 0 and 5: ");
                                    newBrightness = scanner.nextDouble();
                                }
                                l1.setBrightness(newBrightness);
                                break;
                            case 't':
                                System.out.println("Turn On/Off the lights?: ");
                                String onOff = scanner.next();
                                if (onOff.equals("On") || onOff.equals("on")) {
                                    l1.setTurnOn(onOff);
                                    l1.isWorking();
                                } else if (onOff.equals("Off") || onOff.equals("off")) {
                                    l1.setTurnOn(onOff);
                                    System.out.println("You turned off the light ");
                                } else {
                                    System.out.println("Invalid input, please enter on/off ");
                                }
                                break;
                            case 'c':
                                if (l1.canChangeColor()) {
                                    System.out.println("Choose the color you want to use (b)lue, (r)ed, (g)reen : ");
                                    char color = scanner.next().charAt(0);

                                    switch (color) {
                                        case 'r':
                                            l1.setColor("Red");
                                            break;
                                        case 'g':
                                            l1.setColor("Green");
                                            break;
                                        case 'b':
                                            l1.setColor("Blue");
                                            break;
                                        default:
                                            System.out.println("Invalid option. Please choose Red, Green or blue");
                                    }
                                } else {
                                    System.out.println("This light can't change color");
                                }
                                break;
                            default:
                                System.out.println("Invalid option, please pick any option you saw above");
                        }
                        break;
                    case 'c':
                        System.out.println("Which component do you want  to change (p)ower, (b)rightness " +
                                "(t)urnOn/Off, (c)olor , (f)lashing: ");
                        char change2 = scanner.next().charAt(0);

                        switch (change2) {
                            case 'p':
                                System.out.println("Enter new power (5 - max): ");
                                double newPower = scanner.nextDouble();
                                while (newPower > 5 || newPower < 0){
                                    System.out.println("Invalid power, enter value between 0 and 5: ");
                                    newPower = scanner.nextDouble();
                                }
                                c1.setPower(newPower);
                                break;
                            case 'b':
                                System.out.println("Enter new brightness(5 - max): ");
                                double newBrightness = scanner.nextDouble();
                                while (newBrightness >5 || newBrightness < 0){
                                    System.out.println("Invalid brightness, enter value between 0 and 5: ");
                                    newBrightness = scanner.nextDouble();
                                }
                                c1.setBrightness(newBrightness);
                                break;
                            case 't':
                                System.out.println("Turn On/Off the lights?: ");
                                String onOff = scanner.next();
                                if (onOff.equals("On") || onOff.equals("on")) {
                                    c1.setTurnOn(onOff);
                                } else if (onOff.equals("Off") || onOff.equals("off")) {
                                    c1.setTurnOn(onOff);
                                    System.out.println("You turned off the light ");
                                } else {
                                    System.out.println("Invalid input, please enter on/off ");
                                }
                                break;
                            case 'c':
                                if (c1.canChangeColor()) {
                                    System.out.println("Choose the color you want to use (b)lue, (r)ed, (g)reen : ");
                                    char color = scanner.next().charAt(0);

                                    switch (color) {
                                        case 'r':
                                            c1.setColor("Red");
                                            break;
                                        case 'g':
                                            c1.setColor("Green");
                                            break;
                                        case 'b':
                                            c1.setColor("Blue");
                                            break;
                                        default:
                                            System.out.println("Invalid option. Please choose Red, Green or Blue(and please " +
                                                    "enter small letters)");
                                    }
                                } else {
                                    System.out.println("This light can't change color");
                                }
                                break;
                            case 'f':
                                System.out.println("Turn On/Off flashing? (on/off) : ");
                                String flash = scanner.next();
                                if (flash.equals("on") || flash.equals("On")){
                                    c1.setIsFlashing(true);
                                }
                                else if(flash.equals("off") || flash.equals("Off")){
                                    c1.setIsFlashing(false);
                                    System.out.println("You turned off the light ");
                                }else{
                                    System.out.println("Invalid option please choose on/off");
                                }
                                break;
                            default:
                                System.out.println("Invalid option, please pick any option you saw above");
                        }
                        break;
                    case 'r':
                        System.out.println("Which component do you want  to change? (p)ower, (b)rightness" +
                                " (t)urnOn/Off, t(e)mperature : ");
                        char change3 = scanner.next().charAt(0);

                        switch (change3) {
                            case 'p':
                                System.out.println("Enter new power (5 - max): ");
                                double newPower = scanner.nextDouble();
                                while (newPower > 5 || newPower < 0){
                                    System.out.println("Invalid power, enter value between 0 and 5: ");
                                    newPower = scanner.nextDouble();
                                }
                                r1.setPower(newPower);
                                break;
                            case 'b':
                                System.out.println("Enter new brightness(5 - max): ");
                                double newBrightness = scanner.nextDouble();
                                while (newBrightness >5 || newBrightness < 0){
                                    System.out.println("Invalid brightness, enter value between 0 and 5: ");
                                    newBrightness = scanner.nextDouble();
                                }
                                r1.setBrightness(newBrightness);
                                break;
                            case 't':
                                System.out.println("Turn On/Off the lights?: ");
                                String onOff = scanner.next();
                                if (onOff.equals("On") || onOff.equals("on")) {
                                    r1.setTurnOn(onOff);
                                } else if (onOff.equals("Off") || onOff.equals("off")) {
                                    r1.setTurnOn(onOff);
                                } else {
                                    System.out.println("Invalid input, please enter on/off ");
                                }
                                break;
                            case 'e':
                                System.out.println("Enter new temperature(10 - max): ");
                                double newTemperature = scanner.nextDouble();
                                while (newTemperature >10 || newTemperature < 0){
                                    System.out.println("Invalid temperature, enter value between 0 and 10: ");
                                    newTemperature = scanner.nextDouble();
                                }
                                r1.setTemperature(newTemperature);
                                break;
                            default:
                                System.out.println("Invalid option, please pick any option you saw above");
                        }
                        break;
                    default:
                        System.out.println("Invalid light selection, please choose regular (l)ight, (c)ristmas light, or (r)oom light");
                }
            } else {
                System.out.println("Invalid output, please enter y/n ");
            }
        }
    }
}


