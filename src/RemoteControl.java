import java.util.Scanner;

public class RemoteControl {
    Scanner scanner = new Scanner(System.in);
    private boolean stop = false;
    private char dis = scanner.next().charAt(0);
    private char change = scanner.next().charAt(0);
    Light l1 = new Light(5, 5, false, "White");

    public void controlLoop() {
        while (!stop) {
            System.out.println("Do you want to apply any changes? (y/n) : ");

            if (dis == 'n')
                stop = true;
            else {
                System.out.println("Which component do you want  to change: (p)ower, (b)rightness?" +
                        "(t)urnOn/Off, (c)olor : ");
                switch (change) {
                    case 'p':

                }
            }
        }
    }
}


