import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        char dis = scanner.next().charAt(0);
        char change = scanner.next().charAt(0);
        Light l1 = new Light(5, 5, false, "White");
        while(stop == false){
            System.out.println("Do you want to apply any changes? : " + dis);

            if(dis == 'n')
                stop = true;
            else{
                System.out.println("Which component do you want  to change: (p)ower, (b)rightness?" +
                        "(t)urnOn/Off, (c)olor : ");
                switch(change){

                }
            }
        }
    }
}