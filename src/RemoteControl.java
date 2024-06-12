import java.util.Scanner;

public class RemoteControl {
    Scanner scanner = new Scanner(System.in);
    private boolean stop = false;
    Light l1 = new Light(5, 5, "Off", "White");
    CristmasLight c1 = new CristmasLight(5,5,"Off", "White" , false);
    RoomLight r1 = new RoomLight(5,5,"Off", "White", 10);

    public void controlLoop() {
        while (!stop) {
            System.out.println("Do you want to apply any changes? (y/n) : ");
            char dis = scanner.next().charAt(0);

            if (dis == 'n')
                stop = true;
            else {
                System.out.println("Which one of the lights do you want to use? regular (l)ight, (c)ristmas light," +
                        "(r)oom light : ");
                char light = scanner.next().charAt(0);
                System.out.println("Which component do you want  to change (p)ower, (b)rightness?" +
                        "(t)urnOn/Off, (c)olor : ");
                char change = scanner.next().charAt(0);

                switch (change) {
                    case 'p':
                        System.out.println("Enter new power: ");
                        double newPower = scanner.nextDouble();
                        l1.setPower(newPower);
                        break;
                    case 'b':
                        System.out.println("Enter new brightness: ");
                        double newBrightness = scanner.nextDouble();
                        l1.setPower(newBrightness);
                        break;
                    case 't':
                        System.out.println("Turn On/Off the lights?: ");
                        String onOff = scanner.next();
                        if (onOff.equals("On") || onOff.equals("on")){
                            l1.setTurnOn(onOff);
                        }else if(onOff.equals("Off") || onOff.equals("off")){
                            l1.setTurnOn(onOff);
                        } else {
                            System.out.println("Invalid input, please enter on/off ");
                        }
                    case 'c':
                        if (l1.canChangeColor()) {
                            System.out.println("Choose the color you want to use (b)lue, (r)ed, (g)reen : ");
                            char color = scanner.next().charAt(0);

                            switch (color){
                                case 'r':
                                    l1.setColor("Red");
                                case 'g':
                                    l1.setColor("Green");
                                case 'b':
                                    l1.setColor("Blue");
                                default:
                                    System.out.println("Invalid option. Please choose Red, Green or blue");
                            }
                        }else {
                            System.out.println("This light can't change color");
                        }
                    default:
                        System.out.println("Invalid option, please pick any option you saw above");
                }
            }
        }
    }
}


