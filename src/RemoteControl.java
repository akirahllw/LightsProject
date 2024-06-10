import java.util.Scanner;

public class RemoteControl {
    Scanner scanner = new Scanner(System.in);
    private boolean stop = false;
    Light l1 = new Light(5, 5, "Off", "White");

    public void controlLoop() {
        while (!stop) {
            System.out.println("Do you want to apply any changes? (y/n) : ");
            char dis = scanner.next().charAt(0);

            if (dis == 'n')
                stop = true;
            else {
                System.out.println("Which component do you want  to change: (p)ower, (b)rightness?" +
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
                        System.out.println()
                }
            }
        }
    }
}


