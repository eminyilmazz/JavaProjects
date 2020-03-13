package PieBar;
import java.util.Scanner;

public class PieBar {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our pie store!\n");
        String pieTypes = "01: Strawberry Pie\n02: Blueberry Pie\n03: Pumpkin Pie\n04: Apple Pie" +
                          "\n05: Cherry Pie\n06: Peach Pie\n07: Mixed Berry Pie\n08: Lemon Meringue Pie";
        System.out.println("You can choose your order from the list below!\n" + pieTypes);
        String order = input.nextLine();
        Pie pie = new Pie(order);
        pie.bakeThePie();
    }
}

         /*                   (
                              )
                         __..---..__
                     ,-='  /  |  \  `=-.
                    :--..___________..--;
                     \.,_____________,./   */
